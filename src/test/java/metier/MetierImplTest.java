package metier;

import org.junit.Test;
import static org.junit.Assert.*;

public class MetierImplTest {
    @Test public void calculAvecDaoFictif() {
        MetierImpl metier = new MetierImpl();
        metier.setDao(() -> 10.0);
        assertEquals(20.0, metier.calcul(), 0.001);
    }
    @Test public void dependanceAbsenteSignalee() {
        assertThrows(IllegalStateException.class, () -> new MetierImpl().calcul());
    }
}
