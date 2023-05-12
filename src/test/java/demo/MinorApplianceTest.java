package demo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MinorApplianceTest {

    @Test
    public void minorApplianceTestOk(){
        MinorAppliance minorAppliance = new MinorAppliance();
        assertNotNull(minorAppliance);
        //Values must be 1 and HomeAppliance becouse Minor Applicance does not have key
        assertEquals(1, minorAppliance.getHierarchy());
        assertEquals("Optional[HomeAppliance]", Arrays.stream(minorAppliance.getKeyword()).findFirst().toString());
    }
}
