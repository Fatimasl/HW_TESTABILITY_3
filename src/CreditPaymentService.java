public class CreditPaymentService {
    public int calculate(int creditSum, int periodInYears, float ratePerYear) {

        int monthlyPayment;
        float sharePerMonth;
        float a;

        sharePerMonth = ratePerYear / 100 / 12; //доля в месяц (перевод из годовых процентов в месячные доли)
        //К = (М * (1 + М) ^ S) / ((1 + М) ^ S — 1) - коэф-т аннуитета
        //Х = С * К - сумма мес. аннуитета

        a = (float) Math.pow((1 + sharePerMonth), 12 * periodInYears); //промежуточная переменная
        monthlyPayment = (int) (creditSum * (sharePerMonth * a) / (a - 1));

        return monthlyPayment;
    }
}
