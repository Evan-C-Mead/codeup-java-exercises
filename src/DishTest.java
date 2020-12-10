public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.costInCents = 1200;
        dish1.nameOfDish = "Tasty Burger";
        dish1.wouldRecommend = true;

        Dish dish2 = new Dish();
        dish2.costInCents = 1900;
        dish2.nameOfDish = "Spendy Burger";
        dish2.wouldRecommend = false;

        dish1.printSummary();
        dish2.printSummary();

        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);
        DishTools.shoutDishName(dish2);
        DishTools.analyzeDishCost(dish2);
        DishTools.flipRecommendation(dish2);
    }

}