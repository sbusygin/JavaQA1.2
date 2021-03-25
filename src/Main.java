public class Main {
    public static void main(String[] args) {
        int wallet = 2_000_000_000;
        int transaction = 500_000_000;
        wallet += transaction;
        System.out.println(wallet);
    }
}
