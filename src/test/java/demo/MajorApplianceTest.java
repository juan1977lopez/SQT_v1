package demo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MajorApplianceTest {

    @Test
    public void majorApplianceTestOk(){
        MajorAppliance majorAppliance = new MajorAppliance();
        assertNotNull(majorAppliance);
        //Values must be 1 and MajorAppliance
        assertEquals(1, majorAppliance.getHierarchy());
        assertEquals("Optional[MajorAppliance]", Arrays.stream(majorAppliance.getKeyword()).findFirst().toString());
    }
}
