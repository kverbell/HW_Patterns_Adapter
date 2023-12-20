public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2)); //4
        System.out.println(intsCalc.sum(10, 22)); //32
        System.out.println(intsCalc.pow(2, 10)); //1024

    }
}
