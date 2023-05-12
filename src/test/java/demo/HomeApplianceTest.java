package demo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HomeApplianceTest {

    @Test
    public void homeApplianceTestOk(){
        HomeAppliance homeAppliance = new HomeAppliance();
        assertNotNull(homeAppliance);
        //Values must be 0 and HomeAppliance
        assertEquals(0, homeAppliance.getHierarchy());
        assertEquals("Optional[HomeAppliance]", Arrays.stream(homeAppliance.getKeyword()).findFirst().toString());
    }
}
