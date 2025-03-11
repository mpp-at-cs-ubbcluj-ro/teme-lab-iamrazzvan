import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerRepairRequestTest {

    @Test
    @DisplayName("First Test")
    public void testExample() {
        ComputerRepairRequest ccr = new ComputerRepairRequest();
        assertEquals("", ccr.getOwnerName());
        assertEquals("", ccr.getOwnerAddress());
    }

    @Test
    @DisplayName("Second Test")
    public void testExample2() {
        assertEquals(2, 2, "Numerele ar trebui sa fie egale!");
    }
}
