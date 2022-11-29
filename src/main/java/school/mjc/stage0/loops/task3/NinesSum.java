package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;

        while (lengthOfLastNumber > 0) {
            int counter = lengthOfLastNumber;
            StringBuilder sb = new StringBuilder();
            for (;counter > 0; counter--) {
                 sb.append(9);
            }
            sum += Integer.parseInt(sb.toString());
            lengthOfLastNumber--;
        }

        System.out.println(sum);
    }
}
