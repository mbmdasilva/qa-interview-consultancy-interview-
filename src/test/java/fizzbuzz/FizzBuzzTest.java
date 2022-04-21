package fizzbuzz;

import fizzBuzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void validNumberOutput() {
        for (int i = 1; i <= 100; i++)
            if (!(i % 3 == 0) && !(i % 5 == 0)) {
                assertEquals(String.valueOf(i), fizzBuzz.convertNumber(i));
                System.out.println(fizzBuzz.convertNumber(i));
            }
        }

    @Test
    public void fizzAreMultipleOfThreeNotFive() {
        for (int i = 1; i <= 100; i++)
            if ((i % 3 == 0) && !(i % 5 == 0)) {
                assertEquals("Fizz", fizzBuzz.convertNumber(i));
            }
    }

    @Test
    public void buzzAreMultipleOfFiveNotThree() {

        for (int i = 1; i <= 100; i++) {
            if (!(i % 3 == 0) && (i % 5 == 0)) {
                assertEquals("Buzz", fizzBuzz.convertNumber(i));
            }
        }
    }

    @Test
    public void fizzBuzzAreMultiplesoOfThreeAndFive() {

        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                assertEquals("FizzBuzz", fizzBuzz.convertNumber(i));
            }
        }
    }
}
