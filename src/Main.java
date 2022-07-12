public class Main {
    public static void main(String[] args) {

        int amount = 100; //Начальный счёт
        int deposit = 1000; //Сумма пополнения
        int cashback = 100; //1 рубль за 100 рублей
        int sum = amount + deposit; //Общая сумма при пополнении
        int bonus, result;

        if (deposit >= 1000) {
            bonus = deposit / cashback;
            System.out.println(bonus + " Бонусных рублей");
        } else {
            bonus = 0;
            System.out.println("Вы не получили бонус");
        }

        result = sum + bonus; //Итоговая сумма с бонусом
        System.out.println(result + " Итоговый счет");
    }
}
