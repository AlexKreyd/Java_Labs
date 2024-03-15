public class ContinuedFraction {
    private final double constant;
    private final double[] coefficients;
    private final int coef_number;
    public ContinuedFraction(double x, double[] coefs) {
        this.constant = x;
        this.coefficients = new double[coefs.length];
        this.coef_number = coefs.length;
        System.arraycopy(coefs, 0, this.coefficients, 0, coefs.length);
    }

    public double calculate(int n) {
        double value = this.coefficients[n - 1];
        for(int i = n - 2; i >= 0; --i) {
            value = this.coefficients[i] + this.constant / value;
        }
        return value;
    }

    public double sum(ContinuedFraction fraction) {
        return this.calculate(this.coef_number) + fraction.calculate(fraction.coef_number);
    }

    public double diff(ContinuedFraction fraction) {
        return this.calculate(this.coef_number) - fraction.calculate(fraction.coef_number);
    }

    public double multiplication(ContinuedFraction fraction) {
        return this.calculate(this.coef_number) * fraction.calculate(fraction.coef_number);
    }

    public double divison(ContinuedFraction fraction) {
        return this.calculate(this.coef_number) / fraction.calculate(fraction.coef_number);
    }
    public static void main(String[] args) {
        double[] coefs1 = {1, 3, 2 ,5};
        ContinuedFraction fraction1 = new ContinuedFraction(2, coefs1);

        double[] coefs2 = {3, 4, 1 ,2};
        ContinuedFraction fraction2 = new ContinuedFraction(2, coefs2);

        System.out.println("Значение дробей:");
        System.out.println(fraction1.calculate(4));
        System.out.println(fraction2.calculate(4));

        System.out.println("Сумма дробей " + fraction1.sum(fraction2));
        System.out.println("Разность дробей " + fraction1.diff(fraction2));
        System.out.println("Произведение дробей " + fraction1.multiplication(fraction2));
        System.out.println("Деление дробей " + fraction1.divison(fraction2));


    }
}