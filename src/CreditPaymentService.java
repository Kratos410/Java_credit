public class CreditPaymentService {
    public double calculate(int loan, int term, double interestRate) {
        // Сумма кредита * ((m × (1 + m)ⁿ)/((1 + m)ⁿ - 1 ))   : формула аннуитетного платёжа
        // n — количество платежей.
        // m — процентная ставка в месяц, равная годовой ставке, поделённой на 12
        double m = (interestRate / 12) / 100;
        double n;
        if (term == 1) {
            n = 12;
        }
        if (term == 2) {
            n = 24;
        }
        if (term == 3) {
            n = 36;
        } else {
            n = 0;
        }
        double payments = loan * (m * Math.pow(1 + m, n)) / (Math.pow(1 + m, n) - 1); // аннуитетный платёж
        return payments;
    }
}