import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.*;

public class IngredientTest {

    @Test
    public void testGetPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Ketchup", 200);
        float price = ingredient.getPrice();
        assertEquals(200, price, 0.0);
    }

    @Test
    public void testGetName() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Ketchup", 200);
        String name = ingredient.getName();
        assertEquals("Ketchup", name);
    }

    @Test
    public void testGetType() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Ketchup", 200);
        IngredientType type = ingredient.getType();
        assertEquals(IngredientType.SAUCE, type);
    }

    @Test
    public void testConstructor() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "sausage", 300);
        assertEquals(IngredientType.FILLING, ingredient.getType());
        assertEquals("sausage", ingredient.getName());
        assertEquals(300, ingredient.getPrice(), 0.0);
    }
}

