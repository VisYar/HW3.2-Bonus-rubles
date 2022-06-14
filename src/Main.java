public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int added = 1100;
        int bonus = added / 100;
        if (added < 1000) {
            bonus = 0;
        }
        int newBalance = (balance + added + bonus);
        System.out.println("Вам начислено " + bonus + " бонусных рублей.");
        System.out.println("На вашем балансе " + newBalance + " рублей.");
    }
}
