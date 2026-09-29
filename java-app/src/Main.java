public class Main {

    public static int[] solution(int[] numbers) {
        int length = numbers.length;
        if (length == 0) throw new IllegalArgumentException("Numbers cannot be empty.");

        int[] numbersSquared = new int[length];
        for (int index = 0; index < length; index++) {
            int number = numbers[index];
            if (number > 1000 || number < -100)
                throw new IllegalArgumentException("Numbers must be between -100 and 1001.");
            numbersSquared[index] = number * number;
        }

        sort(numbersSquared);
        return numbersSquared;
    }

    private static void sort(int[] numbers) {
        for (int outerIndex = 0; outerIndex < numbers.length; outerIndex++) {
            int minimumIndex = outerIndex;
            for (int innerIndex = outerIndex + 1; innerIndex < numbers.length; innerIndex++) {
                if (numbers[minimumIndex] > numbers[innerIndex]) {
                    minimumIndex = innerIndex;
                }
            }

            if (minimumIndex != outerIndex) {
                int temp = numbers[minimumIndex];
                numbers[minimumIndex] = numbers[outerIndex];
                numbers[outerIndex] = temp;
            }
        }
    }
}