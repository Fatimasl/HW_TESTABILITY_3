public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1_000_000;
        int periodInYears = 1;
        float ratePerYear = 9.99F;
        int monthlyPayment;

        monthlyPayment = service.calculate(creditSum, periodInYears, ratePerYear);
        System.out.println("При сумме кредита " + creditSum + ", процентной ставке " + ratePerYear + " % и периоде кредита " + periodInYears + " год (года, лет)");
        System.out.println("ежемесячный платеж составит: " + monthlyPayment);
        System.out.println();

        periodInYears = 2;

        monthlyPayment = service.calculate(creditSum, periodInYears, ratePerYear);
        System.out.println("При сумме кредита " + creditSum + ", процентной ставке " + ratePerYear + " % и периоде кредита " + periodInYears + " год (года, лет)");
        System.out.println("ежемесячный платеж составит: " + monthlyPayment);
        System.out.println();

        periodInYears = 3;

        monthlyPayment = service.calculate(creditSum, periodInYears, ratePerYear);
        System.out.println("При сумме кредита " + creditSum + ", процентной ставке " + ratePerYear + " % и периоде кредита " + periodInYears + " год (года, лет)");
        System.out.println("ежемесячный платеж составит: " + monthlyPayment);
        System.out.println();
    }
}
