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
        // implementation goes here
        return null;
    }

}