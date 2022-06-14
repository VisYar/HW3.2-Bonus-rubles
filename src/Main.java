public class Main {
    public static void main(String[] args) {
        float balance = 100F; //остаток на счете
        float added = 1100F; // пополнение счета
        int bonus = (int)added / 100;
        if (added <= 1000) {
            bonus = 0;
        }
        float newBalance = (balance + added + bonus);
        System.out.println("Вам начислено " + bonus + " бонусных рублей.");
        System.out.println("На вашем балансе " + newBalance + " рублей.");
    }
}
