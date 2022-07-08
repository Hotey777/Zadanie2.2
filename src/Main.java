public class Main {
    public static void main(String[] args) {

        int x = 100; //Начальный счёт
        int y = 1000; //Сумма пополнения
        int l = 100; //1 рубль за 100 рублей
        int z = x + y; //Общая суммая при пополнении
        int bonus, o;

        if (y >= 1000) {
            bonus = y / l;
            System.out.println(bonus + " Бонусных рублей");
        } else {
            bonus = 0;
            System.out.println("Вы не получили бонус");
        }

        o = z + bonus; //Итоговая сумма с бонусом
        System.out.println(o + " Итоговый счет");
    }
}
