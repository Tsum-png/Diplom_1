import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.*;

public class BurgerTest {

    private Burger burger;
    private Bun bun;
    private Ingredient ingredient1;
    private Ingredient ingredient2;

    @Before
    public void setUp() {
        bun = new Bun("black bun", 100);
        ingredient1 = new Ingredient(IngredientType.SAUCE, "sour cream", 200);
        ingredient2 = new Ingredient(IngredientType.FILLING, "dinosaur", 200);
        burger = new Burger();
    }

    @Test
    public void testSetBuns() {
        burger.setBuns(bun);
        assertEquals(bun, burger.bun);
    }

    @Test
    public void testAddIngredient() {
        burger.addIngredient(ingredient1);
        assertTrue(burger.ingredients.contains(ingredient1));
    }

    @Test
    public void testRemoveIngredient() {
        burger.addIngredient(ingredient1);
        burger.removeIngredient(0);
        assertFalse(burger.ingredients.contains(ingredient1));
    }

    @Test
    public void testMoveIngredient() {
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        burger.moveIngredient(0, 1);
        assertEquals(ingredient1, burger.ingredients.get(1));
        assertEquals(ingredient2, burger.ingredients.get(0));
    }

    @Test
    public void testGetPrice() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        float price = burger.getPrice();
        assertEquals(600, price, 0.0);
    }

    @Test
    public void testGetReceipt() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        String receipt = burger.getReceipt();
        String expectedReceipt = String.format("(==== black bun ====)%n" +
                "= sauce sour cream =%n" +
                "= filling dinosaur =%n" +
                "(==== black bun ====)%n" +
                "%nPrice: 600,000000%n");
        assertEquals(expectedReceipt, receipt);
    }
}

