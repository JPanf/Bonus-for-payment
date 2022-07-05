public class Main {
    public static void main(String[] args) {

        int startAmount = -100;
        int paymentAmount = 978;
        int bonus;

        int totalBalance = startAmount + paymentAmount;
        boolean bonusCondition = totalBalance > 1000;
        int bonusRuble = totalBalance / 100;

        if (bonusCondition) {
            bonus = bonusRuble;
        } else {
            bonus = 0;
        }

        int totalSum = totalBalance + bonus;

        System.out.println("Вам начислено " + bonus + " бонусов");
        System.out.println("Ваш итоговый баланс составляет " + totalSum + " рублей");
    }
}
