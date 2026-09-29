package LcmArrayTask;

public class Lcmfunction {

    public static void main(String[] args) {
        int[] numbers = {8, 10, 24};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int lcm = 1;

        for (int divisor = 2; ; divisor++) {
            boolean divided = false;
            for (int index = 0; index < numbers.length; index++) {
                if (numbers[index] % divisor == 0) {
                    numbers[index] /= divisor;
                    divided = true;
                }
            }
            if (divided) {
                lcm *= divisor;
                divisor--;
            }
            boolean complete = true;
            for (int digit= 0; digit< numbers.length; digit++) {
                if (numbers[digit] != 1) {
                    complete = false;
                    break;
                }
            }
            if (complete)
                return lcm;
        }
    }
}
