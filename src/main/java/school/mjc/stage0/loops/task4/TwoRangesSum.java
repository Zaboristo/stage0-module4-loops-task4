package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip>lastInRow){
            System.out.println("number to skip is bigger then the last");
            return;
        }
        if (lastInRow<0){
            System.out.println("last number in row is negative");
            return;
        }
        int skipSum = 0;
        int lastSum = 0;
        for (int i = 0; i<=lastInRow; i++){
            if(i<=numberToSkip) {
                skipSum += i;
            }
            else lastSum += i;

        }
        System.out.println("skipped sum is " + skipSum);
        System.out.println("counted sum is " + lastSum);
    }
}
