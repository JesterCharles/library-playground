# Case Converter Activity

## Objective
The goal of this project is to create a **Case Converter** application in Java. This tool will allow users to input a variable name in one case format and convert it to another specified case format.

## Requirements
The application should support the following functionalities:
- **Input**: Users should be able to provide a variable name and specify its starting case.
- **Conversion**: The application should convert the variable name to a new specified case.
- **Initial Case**: The starting case of the input should be provided to your converter method/s
- **Supported Cases**:
   - **Snake Case**: `example_variable_name`
   - **Screaming Snake Case**: `EXAMPLE_VARIABLE_NAME`
   - **Pascal Case**: `ExampleVariableName`
   - **Camel Case**: `exampleVariableName`

## Stretch Goal
To enhance the functionality, implement case detection so that the starting case parameter is not required. The application should automatically detect the case of the input variable name.

## Instructions
### Define the Methods Needed for this Application:
- Create input fields for the variable name and the target case
- Create a method to trigger the conversion process
- Create methods to handle the conversion process
- Create a method to display the converted variable name

### Implement Case Conversion Logic:
- Implement functions to convert between different cases
- Ensure that each function handles edge cases and maintains the integrity of the variable name

### Add Case Detection (Stretch Goal):
- Develop a function to detect the case of the input variable name
- Integrate this function into the conversion process to eliminate the need for the starting case parameter

### Testing:
- Test the application with various input cases to ensure accuracy.
- Verify the case detection functionality with different formats.

## Starting Code
```java
public class CaseConverter {

    public static void main(String[] args) {
        String input = "exampleVariableName";
        String initialCase = "camel";
        String targetCase = "snake_case";
        
        String result = convertCase(input, initialCase, targetCase);
        System.out.println("Converted Variable: " + result);
    }

    public static String convertCase(String input, String initialCase, String targetCase) {
        // implementation goes here
    }

}
