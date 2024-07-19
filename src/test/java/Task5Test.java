import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Task5Test {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final InputStream standardIn = System.in;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setIn(standardIn);
        System.setOut(standardOut);
    }

    @Test
    @DisplayName("input 12.0 15.0 10.0")
    public void test1() {
        String input = "12.0 15.0 10.0";
        String output = "Enter length, width and height:" +
                "Buy 3 gallons of paint.";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        PaintCalculator.main(new String[]{});
        assertEquals(output, outputStreamCaptor.toString().trim(), input);
    }

    @Test
    @DisplayName("input 7.5 11.5 8.25")
    public void test2() {
        String input = "7.5 11.5 8.25";
        String output = "Enter length, width and height:" +
                          "Buy 2 gallons of paint.";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        PaintCalculator.main(new String[]{});
        assertEquals(output, outputStreamCaptor.toString().trim(), input);
    }
}
