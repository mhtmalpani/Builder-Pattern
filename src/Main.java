public class Main {

    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();


        builder.newOrder().bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder1 = builder.build();

        System.out.println("Lunch 1 : ");
        System.out.println(lunchOrder1.getBread());
        System.out.println(lunchOrder1.getCondiments());
        System.out.println(lunchOrder1.getDressing());
        System.out.println(lunchOrder1.getMeat());


        builder.newOrder().bread("Whole Grain").dressing("SouthWest").meat("Beef");

        LunchOrder lunchOrder2 = builder.build();

        System.out.println();
        System.out.println("Lunch 2 : ");
        System.out.println(lunchOrder2.getBread());
        System.out.println(lunchOrder2.getCondiments());
        System.out.println(lunchOrder2.getDressing());
        System.out.println(lunchOrder2.getMeat());
    }
}
