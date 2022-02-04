public class Main {
    public static void main(String[] args) {
      BonusMilesService service = new BonusMilesService();
//        количество милей при полной оплате билета
        int amountMili = service.calculator(1100);
        System.out.println(" Количество милей составило " +  amountMili);
//      количество милей при не полной оплате билета
        int amountMiliPromotion = service.calculator(19);
        System.out.println(" Количество милей по акции, составило " +  amountMiliPromotion);

        }
}

