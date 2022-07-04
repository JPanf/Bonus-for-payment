public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int startAmount = -100;
        int paymentAmount = 978;
        int bonus;
        int totalBalance = startAmount + paymentAmount;
        boolean b = totalBalance > 1000;
        int bonusRuble = totalBalance/100;
        if (b) {
            bonus = bonusRuble;
        } else {
            bonus = 0;
        }
        int s = totalBalance + bonus;

        System.out.println("Вам начислено " + bonus + " бонусов");
        System.out.println("Ваш итоговый баланс составляет " + s + " рублей");


        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
