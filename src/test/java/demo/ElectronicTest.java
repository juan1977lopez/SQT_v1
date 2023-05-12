package demo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ElectronicTest {

    @Test
    public void electronicTestOk(){
        Electronic electronic = new Electronic();
        assertNotNull(electronic);
        //Values must be 0 and Electronic
        assertEquals(0, electronic.getHierarchy());
        assertEquals("Optional[Electronic]", Arrays.stream(electronic.getKeyword()).findFirst().toString());
    }
}
