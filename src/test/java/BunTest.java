import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.*;

public class BunTest {

    @Test
    public void testGetName() {
        Bun bun = new Bun("black bun", 100);
        String name = bun.getName();
        assertEquals("black bun", name);
    }

    @Test
    public void testGetPrice() {
        Bun bun = new Bun("black bun", 100);
        float price = bun.getPrice();
        assertEquals(100, price, 0.0);
    }

    @Test
    public void testConstructor() {
        Bun bun = new Bun("black bun", 100);
        assertEquals("black bun", bun.getName());
        assertEquals(100, bun.getPrice(), 0.0);
    }
}

