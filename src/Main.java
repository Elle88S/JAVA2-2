public class Main {
    public static void main(String[] args) {

        int clientstatus = 200;
        int payment = 1100;



int bonuscount;
        boolean bonus;
        if (payment > 1000) {
           bonuscount = payment / 100 + payment;}
        else {
            bonuscount = payment;
        }
        System.out.println (clientstatus + bonuscount);
    }
}