public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loan = 1_000_000;           // Сумма кредита в рублях
        int term = 1;                   // Срок кредита в годах
        double interestRate = 9.99;     // Процентная ставка %
        double payments = service.calculate(loan, term, interestRate);    //Выплаты

        if (term == 1){
            System.out.println("Сумма кредита: " + loan + " р.");
            System.out.println("Процентная ставка: " + interestRate  + " %");
            System.out.println("Срок кредита : " + term + " год");
            System.out.println("Ежемесячная выплата: " + payments  + " р.");
        } else if (term == 2){
            System.out.println("Сумма кредита: " + loan + " р.");
            System.out.println("Процентная ставка: " + interestRate + " %");
            System.out.println("Срок кредита : " + term + " года");
            System.out.println("Ежемесячная выплата: " + payments + " р.");
        }else if (term == 3){
            System.out.println("Сумма кредита: " + loan + " р.");
            System.out.println("Процентная ставка: " + interestRate + " %");
            System.out.println("Срок кредита : " + term + " года");
            System.out.println("Ежемесячная выплата: " + payments + " р.");
        } else if (payments == 0){
            System.out.println("Простите, срок кредита должен составлять от 1 до 3 лет");
        }
    }
}