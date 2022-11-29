package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int min = Math.min(first, second);

        if (min == 0) {
            System.out.println(first + second);
        }
        else {
            for (; min >= 0; min--) {
                if (first % min == 0 && second % min == 0) {
                    System.out.println(min);
                    break;
                }
            }
        }
    }
}
