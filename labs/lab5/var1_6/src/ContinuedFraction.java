import java.util.Scanner;

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
        try {
            double value = this.coefficients[n - 1];
            for (int i = n - 2; i >= 0; --i) {
                value = this.coefficients[i] + this.constant / value;
            }
            return value;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка при вычислении значения дроби");
            return 0;
        }
    }

    public double sum(ContinuedFraction fraction) {
        try {
            return this.calculate(this.coef_number) + fraction.calculate(fraction.coef_number);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка при вычислении суммы дробей");
            return 0;
        }
    }

    public double diff(ContinuedFraction fraction) {
        try {
            return this.calculate(this.coef_number) - fraction.calculate(fraction.coef_number);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка при вычислении разности дробей");
            return 0;
        }
    }

    public double multiplication(ContinuedFraction fraction) {
        try {
            return this.calculate(this.coef_number) * fraction.calculate(fraction.coef_number);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка при вычислении произведения дробей");
            return 0;
        }
    }

    public double divison(ContinuedFraction fraction) {
        try {
            return this.calculate(this.coef_number) / fraction.calculate(fraction.coef_number);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка при вычислении деления дробей");
            return 0;
        }
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите коэффициенты для первой дроби: ");
            String[] coefs1_str = sc.nextLine().split(" ");
            double[] coefs1 = new double[coefs1_str.length];
            for (int i = 0; i < coefs1_str.length; i++) {
                coefs1[i] = Double.parseDouble(coefs1_str[i]);
            }
            //double[] coefs1 = {1, 3, 2 ,5};
            ContinuedFraction fraction1 = new ContinuedFraction(2, coefs1);

            //double[] coefs2 = {3, 4, 1 ,2};
            System.out.println("Введите коэффициенты для второй дроби: ");
            String[] coefs2_str = sc.nextLine().split(" ");
            double[] coefs2 = new double[coefs2_str.length];
            for (int i = 0; i < coefs2_str.length; i++) {
                coefs2[i] = Double.parseDouble(coefs2_str[i]);
            }
            ContinuedFraction fraction2 = new ContinuedFraction(2, coefs2);

            System.out.println("Значение дробей:");
            System.out.println(fraction1.calculate(4));
            System.out.println(fraction2.calculate(4));

            System.out.println("Сумма дробей " + fraction1.sum(fraction2));
            System.out.println("Разность дробей " + fraction1.diff(fraction2));
            System.out.println("Произведение дробей " + fraction1.multiplication(fraction2));
            System.out.println("Деление дробей " + fraction1.divison(fraction2));


        } catch (NumberFormatException e) {
            System.out.println("Введенное значение коэффициента не является числом");
        }
    }
}