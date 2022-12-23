package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        while (counter <= printToInclusive) {
            System.out.println(getFactorial(counter));
            counter++;
        }
    }

    private static int getFactorial(int number) {
        int multiplier = 1;
        int result = 1;
        while (multiplier <= number) {
            result *= multiplier;
            multiplier++;
        }

        return result;
    }
}
