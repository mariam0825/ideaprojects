package GeoPoliticalZone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class politicalZoneTest {
    @Test
    public void testThat_AStateBelongToaParticularPoliticalZone(){
        GeoPolitical zone = GeoPoliticalMethod.findZone("Ogun");
        assertEquals(GeoPolitical.SOUTHWEST, zone);
    }
    @Test
    public void testThat_AStateThatDoesNotBelongToTheList(){
        GeoPolitical zone = GeoPoliticalMethod.findZone("yaba");
        assertNull(zone);
    }

}
