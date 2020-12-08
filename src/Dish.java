public class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary() {
        System.out.printf("Cost: %d¢\nName: %s\nRecommended: %s\n\n", costInCents, nameOfDish, wouldRecommend);
        System.out.printf("Cost: $%.2f\nName: %s\nRecommended: %s\n\n", costInCents/100.00, nameOfDish, wouldRecommend);
    }

}
