import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class Task4Test {

//    @Test
//    @DisplayName("gallonsPaint(12.0, 15.0, 10.0)")
//    public void test1() throws Exception {
//        Method method = Class.forName("PaintCalculator").getMethod("gallonsPaint",double.class, double.class, double.class);
//        assertEquals(3, method.invoke(null, 12.0, 15.0, 10.0));
//    }
//
//    @Test
//    @DisplayName("gallonsPaint(7.5, 11.5, 8.25)")
//    public void test2() throws Exception {
//        Method method = Class.forName("PaintCalculator").getMethod("gallonsPaint",double.class, double.class, double.class);
//        assertEquals(2, method.invoke(null, 7.5, 11.5, 8.25));
//    }

  @Test
  @DisplayName("gallonsPaint(12.0, 15.0, 10.0)")
  public void test1() {
    assertEquals( 3, PaintCalculator.gallonsPaint(12.0, 15.0, 10.0));
  }

  @Test
 @DisplayName("gallonsPaint(7.5, 11.5, 8.25)")
  public void test2() {
    assertEquals(2, PaintCalculator.gallonsPaint(7.5, 11.5, 8.25));
  }

}