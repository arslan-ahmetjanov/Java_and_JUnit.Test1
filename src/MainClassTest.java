import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    @Test
    public static void testGetLocalNumber() {
        int result = Main.getLocalNumber();
        Assertions.assertEquals(result, 14, "getLocalNumber() return not 14");
    }
}
