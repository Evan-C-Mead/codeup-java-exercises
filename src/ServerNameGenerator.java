import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"good", "full", "late", "dank", "strong", "important", "old", "special", "free", "clear"};
        String[] nouns = {"school", "person", "finger", "magazine", "yard", "night", "child", "arena", "bat", "program"};

        System.out.printf("Your server name is: %s %s", randomizer(adjectives), randomizer(nouns));
    }

    public static String randomizer(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }
}
