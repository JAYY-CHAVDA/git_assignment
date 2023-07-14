package calc.java;

public class Calc {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        int result = calc.add(5, 3);
        System.out.println("The result of addition is: " + result);
    }

}
