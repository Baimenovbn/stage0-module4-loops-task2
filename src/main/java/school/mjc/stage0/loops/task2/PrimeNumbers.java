package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive == 0 || printToInclusive == 1) {
            return;
        }

        int counter = 2;
        while (counter <= printToInclusive) {
            if (isNumberPrime(counter)) {
                System.out.println(counter);
            }

            counter++;
        }
    }

    public static boolean isNumberPrime(int guessNumber) {
        int i = 2;

        while (i <= guessNumber) {
            if (guessNumber % i == 0 && i == guessNumber) {
                return true;
            } else if (guessNumber % i == 0) {
                return false;
            }
            i++;
        }

        return false;
    }
}
