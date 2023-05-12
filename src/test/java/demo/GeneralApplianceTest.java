package demo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneralApplianceTest {

    @Test
    public void generalApplianceTestOk(){
        GeneralAppliance generalAppliance = new GeneralAppliance();
        assertNotNull(generalAppliance);
        //Value must be 2 and MajorAppliance because Generel Applicance does not have key
        assertEquals(2, generalAppliance.getHierarchy());
        assertEquals("Optional[MajorAppliance]",Arrays.stream(generalAppliance.getKeyword()).findFirst().toString());
    }

}
