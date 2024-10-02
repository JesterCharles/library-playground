public class CaseConverter {

    /*
     * Cases we are working with:
     * - camel
     * - pascal
     * - snake
     * - screaming snake
     */
    public static void main(String[] args) {
        String input = "exampleVariableName";
        String initialCase = "camel";
        String targetCase = "snake_case";
        
        CaseConverter converter = new CaseConverter();

        String result = converter.convertCase(input, initialCase, targetCase);
        System.out.println("Converted Variable: " + result);
    }

    public String convertCase(String input, String initialCase, String targetCase) {
        // Keep in mind, you don't NEED to do nested switches, you could organize your code into methods and facilitate code flow that way
        switch(initialCase){
            case "camel":
                switch(targetCase){
                    case "snake_case":
                        return convertCamelCaseToSnakeCase(input);
                }
        }
        return "Conversion failed, please try again!";
    }

    public String convertCamelCaseToSnakeCase(String input){
        // Anytime you need to manipulate String values StringBuilder should be used
        StringBuilder stringBuilder = new StringBuilder(input);
        // we can loop through the characters of the String in our String builder to look for uppercase characters
        for(int index = 0; index < stringBuilder.length(); index++){
            // we need to check if a character is uppercase: if not, we just continue the loop
            if(Character.isUpperCase(stringBuilder.charAt(index))){
                /*
                 *  If an uppercase character is found we need to provide some information to the StringBuilder to update our variable name:
                 *  1. starting index for the replacement (should just be index)
                 *  2. ending point for the replacement (should be index + 1, since the one uppercase character is being replaced)
                 *  3. new String value to replace uppercase letter with (we can do the underscore and lowercase letter, Stringbuilder 
                 *     will handle adjusting the String to accomodate)
                 */
                int replaceStartIndex = index;
                int replaceEndIndex = index + 1;
                char replacementCharacter = Character.toLowerCase(stringBuilder.charAt(index)); // this needs to be convereted to a String
                String replacementString = "_" + Character.toString(replacementCharacter); // we use String concatenation to set the underscore and lowercase character
                stringBuilder.replace(replaceStartIndex, replaceEndIndex, replacementString); // replace the content
            }
            // no need for an else statement
        }
        // don't forget to return the String!
        return stringBuilder.toString();
    }

}