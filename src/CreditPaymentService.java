public class CreditPaymentService {
    public double calculate(int loan, int term, double interestRate) {
        double payments;
        if (term == 1) {
            double m = (interestRate / 12) / 100;                                    //m — процентная ставка в месяц, равная годовой ставке, поделённой на 12,
            double coefficient = m * ((1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m));
            payments = loan * coefficient;
            System.out.println(payments);
        } else {
            if (term == 2) {
                double m = (interestRate / 12) / 100;                               //m — процентная ставка в месяц, равная годовой ставке, поделённой на 12,
                double coefficient = m * ((1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m));
                payments = loan * coefficient;
            } else {
                if (term == 3) {
                    double m = (interestRate / 12) / 100;                           //m — процентная ставка в месяц, равная годовой ставке, поделённой на 12,
                    double coefficient = m * ((1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m));
                    payments = loan * coefficient;
                }
            }
        }
        return payments;
    }
}