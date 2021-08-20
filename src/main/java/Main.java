public class Main {
    static int[] amounts = new int[100];
    static String[] borrowers = new String[100];
    static boolean[] isPaid = new boolean[100];
    static int loansCount = 0;

    public static void addLoan(String borrower, int amount){
        borrowers[loansCount] = borrower;
        amounts[loansCount] = amount;
        loansCount++;
    }

    public static void setAsPaid(String borrower){
        for (int i=0; i< loansCount; i++){
            if (borrowers[i].equals(borrower)){
                isPaid[i] = true;
            }
        }
    }

    public static void listLoans(){
        for (int i=0; i< loansCount; i++){
            if (!isPaid[i]){
                System.out.println(borrowers[i] + ": " + amounts[i]);
            }
        }
    }

    public static void main(String[] args) {
        addLoan("Alice Betsy", 10);
        addLoan("Ben Chee", 20);
        addLoan("Chris Davis", 30);
        setAsPaid("Ben Chee");
        listLoans();
    }
}