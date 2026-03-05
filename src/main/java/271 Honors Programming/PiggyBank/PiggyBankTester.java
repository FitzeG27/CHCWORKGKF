package PiggyBank;

public class PiggyBankTester {
    public static void main(String[] args) {
        
        PiggyBank pinky = new PiggyBank(10, 36, 45, 62);

        pinky.withdrawCoins(6, 3, 44, 7);
        pinky.depositCoins(2, 5, 17, 82);
        System.out.println(pinky);




    }
}
