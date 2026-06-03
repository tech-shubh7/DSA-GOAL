// Take a character and check if it is a letter, a digit, or neither.
public class checkCharacter {
    public static String check(char ch) {
        if(Character.isDigit(ch)) {
            return  "digit";
        } else if (Character.isLetter(ch)) {
            return "letter";
        } else {
            return "neither";
        }
    }

    public static void main(String[] args) {
        System.out.println(check('4'));
        System.out.println(check('t'));
        System.out.println(check('$'));
    }
}
