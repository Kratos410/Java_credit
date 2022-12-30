public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loan = 1_000_000;           // Сумма кредита в рублях
        int term = 1;                   // Срок кредита в годах
        double interestRate = 9.99;     // Процентная ставка %
        double payments = service.calculate(loan, term, interestRate);    //Выплаты
        System.out.println("Сумма кредита: " + loan + " р.");
        if (term == 1) {
            System.out.println("Срок кредита : " + term + " год");
        }
        if (term == 2) {
            System.out.println("Срок кредита : " + term + " года");
        }
        if (term == 3) {
            System.out.println("Срок кредита : " + term + " года");
        }
        System.out.println("Процентная ставка: " + interestRate + " %");
        System.out.println("Ежемесячная выплата: " + payments + " р.");
    }
}