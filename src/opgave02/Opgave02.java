package opgave02;

public class Opgave02 {
    public static void main(String[] args) {
            String[] testStrings = {
                    "(3+{5{99{*}}[23[{67}67]]})", // valid
                    "(}){", // invalid
                    "([{}])", // valid
                    "(((())))", // valid
                    "({[)]}", // invalid
                    "" // valid (empty string)
            };

            for (String test : testStrings) {
                boolean result = ParentheseChecker.checkParentheses(test);
                System.out.println("Input: " + test + " -> " + (result ? "Valid" : "Invalid"));
            }
        }
    }

