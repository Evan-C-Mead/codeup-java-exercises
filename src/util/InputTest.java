package util;

public class InputTest {

    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println(userInput.getString());
        System.out.println(userInput.yesNo());
        System.out.println(userInput.getInt());
        System.out.println(userInput.getInt(27, 89));
        System.out.println(userInput.getDouble());
        System.out.println(userInput.getInt(12, 43));
        userInput.getString();

    }

}
