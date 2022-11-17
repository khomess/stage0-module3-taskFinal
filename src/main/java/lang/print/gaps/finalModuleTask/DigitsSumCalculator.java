package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int numberCalculateSum = 0;
        while (number != 0){
            int numberSaver = number % 10;
            numberCalculateSum = numberCalculateSum + numberSaver;
            number = number / 10;
        }
        System.out.println(numberCalculateSum);
    }
}
