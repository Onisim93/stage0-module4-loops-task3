package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int previous = 1;
        int next = 1;


        for (int i = 0; i < lastFibonacci; i++){
            if (i == 0) {
                System.out.println(i);
            }
            else if (i < 3) {
                System.out.println(1);
            }
            else {
                int temp = next;
                next = previous + next;
                previous = temp;
                System.out.println(next);
            }

        }
    }
}
