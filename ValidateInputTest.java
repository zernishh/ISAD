public class ValidateInputTest {

    public static void main(String[] args) {
        testValidateInput();
    }

    public static void testValidateInput() {
        System.out.println("Testing validateInput method...");

        // Test cases
        boolean result1 = SeasonModule.validateInput("Australia", "January"); // Valid country, valid month
        assert result1 == true : "Test case 1 failed. Expected: true, Actual: " + result1;

        boolean result2 = SeasonModule.validateInput("Australia", "InvalidMonth"); // Valid country, invalid month
        assert result2 == false : "Test case 2 failed. Expected: false, Actual: " + result2;

        boolean result3 = SeasonModule.validateInput("InvalidCountry", "January"); // Invalid country, valid month
        assert result3 == false : "Test case 3 failed. Expected: false, Actual: " + result3;

        boolean result4 = SeasonModule.validateInput("InvalidCountry", "InvalidMonth"); // Invalid country, invalid month
        assert result4 == false : "Test case 4 failed. Expected: false, Actual: " + result4;

        System.out.println("All test cases passed successfully.");
    }
}


