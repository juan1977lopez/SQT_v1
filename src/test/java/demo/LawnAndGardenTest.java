package demo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LawnAndGardenTest {

    @Test
    public void lawnAndGardenTestOk(){
        LawnAndGarden lawnAndGarden = new LawnAndGarden();
        assertNotNull(lawnAndGarden);
        //Values must be 1 and Lawn becouse is first value in the String[]
        assertEquals(1, lawnAndGarden.getHierarchy());
        assertEquals("Optional[Lawn]", Arrays.stream(lawnAndGarden.getKeyword()).findFirst().toString());
    }
}
