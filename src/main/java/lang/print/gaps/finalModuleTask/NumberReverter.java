package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int numberRevert = 0;
        while(number != 0){
            int numberSaver = number % 10;
            numberRevert = numberRevert*10 + numberSaver;
            number =number / 10;
        }
        System.out.println(numberRevert);
    }
}
