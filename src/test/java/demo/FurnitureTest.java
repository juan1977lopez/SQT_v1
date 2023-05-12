package demo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FurnitureTest {

    @Test
    public void furnitureTestOk(){
        Furniture furniture = new Furniture();
        assertNotNull(furniture);
        //Values must be 0 and Furniture
        assertEquals(0, furniture.getHierarchy());
        assertEquals("Optional[Furniture]", Arrays.stream(furniture.getKeyword()).findFirst().toString());
    }
}
