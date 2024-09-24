import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.*;

public class IngredientTest {

    @Test
    public void testGetPrice() {
        // Arrange
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Ketchup", 200);

        // Act
        float price = ingredient.getPrice();

        // Assert
        assertEquals(200, price, 0.0);
    }

    @Test
    public void testGetName() {
        // Arrange
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Ketchup", 200);

        // Act
        String name = ingredient.getName();

        // Assert
        assertEquals("Ketchup", name);
    }

    @Test
    public void testGetType() {
        // Arrange
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Ketchup", 200);

        // Act
        IngredientType type = ingredient.getType();

        // Assert
        assertEquals(IngredientType.SAUCE, type);
    }

    @Test
    public void testConstructor() {
        // Arrange
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Patty", 300);

        // Assert
        assertEquals(IngredientType.FILLING, ingredient.getType());
        assertEquals("Patty", ingredient.getName());
        assertEquals(300, ingredient.getPrice(), 0.0);
    }
}

