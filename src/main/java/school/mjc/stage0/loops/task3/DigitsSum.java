package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        t = Math.abs(t);
        while (t > 0) {
            int digit = t % 10;
            sum += digit;
            t /= 10;
        }

        System.out.println(sum);
    }
}
