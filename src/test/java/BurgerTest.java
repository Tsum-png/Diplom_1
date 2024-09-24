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
        // Arrange
        bun = new Bun("Sesame", 200);
        ingredient1 = new Ingredient(IngredientType.SAUCE, "Ketchup", 100);
        ingredient2 = new Ingredient(IngredientType.FILLING, "Patty", 400);
        burger = new Burger();
    }

    @Test
    public void testSetBuns() {
        // Act
        burger.setBuns(bun);

        // Assert
        assertEquals(bun, burger.bun);
    }

    @Test
    public void testAddIngredient() {
        // Act
        burger.addIngredient(ingredient1);

        // Assert
        assertTrue(burger.ingredients.contains(ingredient1));
    }

    @Test
    public void testRemoveIngredient() {
        // Arrange
        burger.addIngredient(ingredient1);

        // Act
        burger.removeIngredient(0);

        // Assert
        assertFalse(burger.ingredients.contains(ingredient1));
    }

    @Test
    public void testMoveIngredient() {
        // Arrange
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);

        // Act
        burger.moveIngredient(0, 1);

        // Assert
        assertEquals(ingredient1, burger.ingredients.get(1));
        assertEquals(ingredient2, burger.ingredients.get(0));
    }

    @Test
    public void testGetPrice() {
        // Arrange
        burger.setBuns(bun);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);

        // Act
        float price = burger.getPrice();

        // Assert
        assertEquals(900, price, 0.0); // 2 * 2.5 + 0.5 + 3.0 = 8.5
    }

    @Test
    public void testGetReceipt() {
        // Arrange
        burger.setBuns(bun);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);

        // Act
        String receipt = burger.getReceipt();

        // Assert
        String expectedReceipt = String.format("(==== Sesame ====)%n" +
                "= sauce Ketchup =%n" +
                "= filling Patty =%n" +
                "(==== Sesame ====)%n" +
                "%nPrice: 900,000000%n");

        assertEquals(expectedReceipt, receipt);
    }
}

