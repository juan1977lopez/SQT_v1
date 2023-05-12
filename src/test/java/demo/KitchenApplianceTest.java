package demo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KitchenApplianceTest {

    @Test
    public void kitchenApplianceTestOk(){

        KitchenAppliance kitchenAppliance = new KitchenAppliance();
        assertNotNull(kitchenAppliance);
        //Value must be 2 and KitchenAppliance
        assertEquals(2, kitchenAppliance.getHierarchy());
        assertEquals("Optional[KitchenAppliance]", Arrays.stream(kitchenAppliance.getKeyword()).findFirst().toString());
    }
}
