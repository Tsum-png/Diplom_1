import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.*;

public class BunTest {

    @Test
    public void testGetName() {
        // Arrange
        Bun bun = new Bun("black bun", 100);

        // Act
        String name = bun.getName();

        // Assert
        assertEquals("black bun", name);
    }

    @Test
    public void testGetPrice() {
        // Arrange
        Bun bun = new Bun("black bun", 100);

        // Act
        float price = bun.getPrice();

        // Assert
        assertEquals(100, price, 0.0);
    }

    @Test
    public void testConstructor() {
        // Arrange
        Bun bun = new Bun("black bun", 100);

        // Assert
        assertEquals("black bun", bun.getName());
        assertEquals(100, bun.getPrice(), 0.0);
    }
}

