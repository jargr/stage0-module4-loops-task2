package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int i = 0;
        int f = 1;
        while (i <= printToInclusive){
            f = i <= 1? 1 : f * i;
            System.out.println( f  );
i++;
        }

    }
}
