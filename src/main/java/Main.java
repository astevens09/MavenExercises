import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
//        String test = StringUtils.reverse("Anthony Stevens");
//        String test2 = StringUtils.swapCase("Anthony Stevens");
//
//        System.out.println(test2);
        Input input = new Input();

        String userInput = input.getString("Enter something: ");
        System.out.printf("\nYou entered: %s", userInput);

        System.out.printf("\n%s is%sa number",userInput,
                StringUtils.isNumericSpace(userInput)?" ":" not ");

        System.out.printf("\nFlipped case: %s", StringUtils.swapCase(userInput));
        System.out.printf("\nReversed: %s", StringUtils.reverse(userInput));

    }
}
