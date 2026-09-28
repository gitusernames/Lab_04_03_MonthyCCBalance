public class MonthlyCCBalance {
    static void main() {
        double balance = 5000;
        double interestRate = 0.17;
        double firstMonthInterest;
        double secondMonthInterest;
        firstMonthInterest = balance * interestRate;
        balance = balance + firstMonthInterest;
        secondMonthInterest = balance * interestRate;
        System.out.println("The interest due after one month is " + firstMonthInterest);
        System.out.println("The interest due after two months is " + secondMonthInterest);
    }
}
