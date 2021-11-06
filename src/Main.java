public class Main {
    public static void main (String[] args) {
        double accountBalance = 322.10;
        double refillAmount = 1230;
        int oneBonusCost = 100;

        if (refillAmount < 0) {
            System.out.println("The refill amount cannot be less than zero");
        } else {
            int bonus = 0;

            if (refillAmount > 1000) {
                if (oneBonusCost <= 0) {
                    System.out.println("The cost of one bonus cannot be less than zero");
                } else {
                    bonus = (int)(refillAmount / oneBonusCost);
                }
            }

            double total = accountBalance + refillAmount + bonus;
            System.out.println("Bonus = " + bonus);
            System.out.println("Account total = " + total);
        }
    }
}
