package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int c = number%10; //489 - 9
        int b = ((number%100) - c)/10; //89 - 8
        int a = (number-(number%100))/100;//400 - 4
        System.out.println(c+""+b+""+a);

    }
}
