public class CharacterCheck {
    public static String check(char ch) {
       if(Character.isUpperCase(ch)) {
           return "uppercase";
       } else if (Character.isLowerCase(ch)) {
           return "lowercase";
       } else if (Character.isDigit(ch)) {
           return  "digit";
       } else {
           return  "special character";
       }
    }

    public static void main(String[] args) {
        String result = check('@');
        System.out.println(result);
    }
}

