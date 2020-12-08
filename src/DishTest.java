public class DishTest {

    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 1200;
        dish1.nameOfDish = "Tasty Burger";
        dish1.wouldRecommend = true;

        dish1.printSummary();
    }

}