public class Main {
    static int[] loans = new int[100];
    static int loansCount = 0;

    public static void addLoan(int amount){
        loans[loansCount] = amount;
        loansCount++;
    }

    public static void listLoans(){
        for (int i=0; i< loansCount; i++){
            System.out.println(loans[i]);
        }
    }

    public static void main(String[] args) {
        addLoan(10);
        addLoan(20);
        listLoans();
    }
}