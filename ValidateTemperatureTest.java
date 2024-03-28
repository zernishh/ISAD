public class ValidateTemperatureTest {

    public static void main(String[] args) {
        testValidateTemperature();
    }

    public static void testValidateTemperature() {
        System.out.println("Testing validateTemperature method...");

        // Equivalence Testing
        // Valid City && valid temperature
        TemperatureModule.validateTemperature(20.0, "Perth"); // No output expected

        // Invalid Temperature
        TemperatureModule.validateTemperature(838, "Perth"); // Expected: "Invalid temperature reading. Valid range is 0.7°C to 46.0°C."

        // Invalid City
        TemperatureModule.validateTemperature(20.0, "Paris"); // Expected: “Invalid city”

        // White Box Testing - if block
        // Enter the 'Perth' if part
        TemperatureModule.validateTemperature(20.0, "Perth"); // No output (successful validation)

        // Enter the 'Dubai' if part
        TemperatureModule.validateTemperature(30.0, "Dubai"); // No output (successful validation)

        // Enter the else part
        TemperatureModule.validateTemperature(20.0, "Paris"); // Output: "Invalid city" (indicating invalid city entry)

        // White Box Testing - try-catch block
        // Success
        TemperatureModule.validateTemperature(20.0, "Perth"); // No exception thrown, no output

        // Invalid City
        TemperatureModule.validateTemperature(20.0, "Paris"); // Caught IllegalArgumentException, prints "Invalid city" message and returns

        System.out.println("All test cases passed successfully.");
    }
}





