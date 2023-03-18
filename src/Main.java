public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int ticket = 133;
        int step = 20;
        int mileOnTicket = 1;
        int bonusTicket = ticket / step * mileOnTicket;
        System.out.println("Начислено бонусов:" + bonusTicket);

    }
}