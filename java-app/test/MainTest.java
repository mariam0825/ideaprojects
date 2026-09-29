import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MainTest {

    @Test
    void testPositiveNumbers() {
        int[] numbers = {3, 5, 2, 6};
        int[] expected = {4, 9, 25, 36};

        int[] actual = Main.solution(numbers);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testNegativeNumbers() {
        int[] numbers = {-3, -5, -2, -6};
        int[] expected = {4, 9, 25, 36};

        int[] actual = Main.solution(numbers);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testPositiveAndNegativeNumbers() {
        int[] numbers = {13, -3, -23, 16};
        int[] expected = {9, 169, 256, 529};

        int[] actual = Main.solution(numbers);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDescendingOrder() {
        int[] numbers = {4, 3, 2, 1};
        int[] expected = {1, 4, 9, 16};

        int[] actual = Main.solution(numbers);
        assertArrayEquals(expected, actual);
    }

    @Test
    void numbersGreaterThat1000_throwsExceptionTest() {
        int[] numbers = {3, 999, 1001, 345};
        assertThrows(
                IllegalArgumentException.class,
                () -> Main.solution(numbers)
        );
    }

    @Test
    void numbersLesserThanMinus100_throwsExceptionTest() {
        int[] numbers = {3, -101, -1001, -345};
        assertThrows(
                IllegalArgumentException.class,
                () -> Main.solution(numbers)
        );
    }

    @Test
    void emptyArrayThrowsExceptionTest() {
        int[] numbers = {};
        assertThrows(
                IllegalArgumentException.class,
                () -> Main.solution(numbers)
        );
    }
}