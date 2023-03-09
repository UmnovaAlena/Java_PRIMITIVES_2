public class Main {
    public static void main(String[] args) {
        int balance = 150;
        int payment = 100;
        int bonus;
        int total_balance;

        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        total_balance = balance + payment + bonus;

        System.out.println("Итоговый счет: " + total_balance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");
    }
}