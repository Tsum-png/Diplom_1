import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.*;

public class IngredientTypeTest {

    @Test
    public void testIngredientTypeValues() {
        IngredientType[] types = IngredientType.values();
        assertArrayEquals(new IngredientType[]{IngredientType.SAUCE, IngredientType.FILLING}, types);
    }

    @Test
    public void testValueOf() {
        assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
        assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }
}

