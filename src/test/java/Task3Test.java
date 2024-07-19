import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

public class Task3Test {

//    @Test
//    @DisplayName("roomArea(12.0, 15.0, 10.0)")
//    public void test1() throws Exception {
//        Method method = Class.forName("PaintCalculator").getMethod("roomArea",double.class, double.class, double.class);
//        assertEquals(720.0, method.invoke(null, 12.0, 15.0, 10.0));
//    }
//
//    @Test
//    @DisplayName("roomArea(7.5, 11.5, 8.25)")
//    public void test2() throws Exception {
//        Method method = Class.forName("PaintCalculator").getMethod("roomArea",double.class, double.class, double.class);
//        assertEquals(399.75, method.invoke(null, 7.5, 11.5, 8.25));
//    }


    @Test
    @DisplayName("roomArea(12.0, 15.0, 10.0)")
    public void test1() {
        assertEquals(720, PaintCalculator.roomArea(12.0, 15.0, 10.0));
    }

    @Test
    @DisplayName("roomArea(7.5, 11.5, 8.25)")
    public void test2() {
        assertEquals(399.75, PaintCalculator.roomArea(7.5, 11.5, 8.25));
    }

}