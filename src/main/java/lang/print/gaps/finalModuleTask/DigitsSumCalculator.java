package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {// 4891
        int d = number%10; //4891 - 1
        int c = (number%100) - d; //91 - 90
        int b = (number%1000) - c -d; //891 - 800
        int a = (number-b-c-d);
        c /=10;
        b /=100;
        a /=1000;
        System.out.println(a+b+c+d);
    }
}
