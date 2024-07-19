import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

public class Task1Test {

//  @Test
//  @DisplayName("ceilingArea(12.0, 15.0)")
//  public void test1() throws Exception {
//    Method method = Class.forName("PaintCalculator").getMethod("ceilingArea",double.class, double.class);
//    assertEquals(180.0, method.invoke(null, 12.0, 15.0));
//  }
//
//  @Test
//  @DisplayName("ceilingArea(7.5, 11.5)")
//  public void test2() throws Exception {
//    Method method = Class.forName("PaintCalculator").getMethod("ceilingArea",double.class, double.class);
//    assertEquals(86.25, method.invoke(null, 7.5, 11.5));
//  }

  @Test
  @DisplayName("ceilingArea(12.0, 15.0)")
  public void test1() {
    assertEquals(180.0, PaintCalculator.ceilingArea(12.0, 15.0));
  }

  @Test
  @DisplayName("ceilingArea(7.5, 11.5)")
  public void test2() {
    assertEquals(86.25, PaintCalculator.ceilingArea(7.5, 11.5));
  }

}