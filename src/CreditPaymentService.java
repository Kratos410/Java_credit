public class CreditPaymentService {
    public double  calculate(int loan, int term, double interestRate) {
        double m = (interestRate / 12) / 100; //m — процентная ставка в месяц, равная годовой ставке, поделённой на 12,
        double coefficient;  // m × (1 + m)ⁿ , n — количество платежей.
        if (term == 1) {
        coefficient =( m * ((1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m)))/(((1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m))-1);
        }else if (term == 2) {
        coefficient =(m * ((1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m)))/(((1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m))-1);
        }else if (term == 3) {
        coefficient =( m * ((1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m)))/((((1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m) * (1 + m)))-1);
        }else{
            coefficient = 0;
        }
        double payments  = loan * coefficient;
        return payments;
    }
}