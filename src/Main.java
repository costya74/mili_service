public class Main {
    public static void main(String[] args) {
        int ticket = 1100;
        int mili = 1;
        int payment = 20;

        long amountMili = ticket * mili / payment;

        System.out.println(" Количество милей составило " +  amountMili);
        }
}
