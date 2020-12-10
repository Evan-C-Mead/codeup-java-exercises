public class DishTools {

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish name) {
        System.out.println(name.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(Dish cost) {
        if (cost.costInCents > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("More expensive than average.");
        } else {
            System.out.println("Less expensive than average.");
        }
    }

    public static void flipRecommendation(Dish recommend) {
        System.out.println(!recommend.wouldRecommend);
    }

}
