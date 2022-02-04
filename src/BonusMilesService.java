public class BonusMilesService {
    public int calculator(int ticket) {
        int mili = 1;
        int payment = 20;
        int amountMili = ticket * mili / payment;

        return amountMili;
    }

}
