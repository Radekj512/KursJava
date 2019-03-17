package pl.sda.CodeWars;

public class Money {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        // your code
        int numberOfYears = 0;
        while (principal < desired) {
            double dochod = (principal * interest);
            principal = principal + dochod - (dochod * tax);
            numberOfYears++;
        }
        return numberOfYears;
    }
}
