import java.util.Scanner;

public class CompareTemperatureTest {

    public static void main(String[] args) {
        testEquivalencePartitioning();
        testBoundaryValueAnalysis();
        testWhiteBox();
    }

    public static void testEquivalencePartitioning() {
        System.out.println("Testing equivalence partitioning for compareTemperature method...");
        // Equivalence partitioning tests
        String result;

        // Temperature above average by less than 6 degrees
        result = TemperatureModule.compareTemperature(25.0, "Perth");
        assert result.equals("Temperature reading is above the average") : "Test failed for temperature above average by less than 6 degrees";

        // Temperature below average by less than 6 degrees
        result = TemperatureModule.compareTemperature(15.0, "Perth");
        assert result.equals("Temperature reading is below the average") : "Test failed for temperature below average by less than 6 degrees";

        // Temperature above average by more than 6 degrees
        result = TemperatureModule.compareTemperature(30.0, "Perth");
        assert result.equals("Temperature reading is above the average by more than 6 degrees") : "Test failed for temperature above average by more than 6 degrees";

        // Temperature below average by more than 6 degrees
        result = TemperatureModule.compareTemperature(5.0, "Perth");
        assert result.equals("Temperature reading is below the average by more than 6 degrees") : "Test failed for temperature below average by more than 6 degrees";

        // Invalid City
        result = TemperatureModule.compareTemperature(20.0, "Paris");
        assert result.equals("Invalid city") : "Test failed for invalid city";
    }

    public static void testBoundaryValueAnalysis() {
        System.out.println("Testing boundary value analysis for compareTemperature method...");
        // Boundary value analysis tests
        String result;

        // Between invalid (below min temp) and ≥6 degrees less than mean
        result = TemperatureModule.compareTemperature(0.6, "Perth");
        assert result.equals("Invalid temperature reading. Valid range is 0.7°C to 46.0°C.") : "Test failed for boundary value analysis";

        // Between ≥6 degrees less than mean and valid temp range
        result = TemperatureModule.compareTemperature(12.2, "Perth");
        assert result.equals("Temperature reading is below the average by more than 6 degrees") : "Test failed for boundary value analysis";

        // Between valid temp range and ≥6 degrees more than mean
        result = TemperatureModule.compareTemperature(24.1, "Perth");
        assert result.equals("Temperature reading is above the average") : "Test failed for boundary value analysis";

        // Between ≥6 degrees more than mean and invalid (above max temp)
        result = TemperatureModule.compareTemperature(46.1, "Perth");
        assert result.equals("Invalid temperature reading. Valid range is 0.7°C to 46.0°C.") : "Test failed for boundary value analysis";
    }

    public static void testWhiteBox() {
        System.out.println("Testing white-box testing for compareTemperature method...");
        // White-box testing
        String result;

        // Enter outer if part
        result = TemperatureModule.compareTemperature(25.0, "Perth");
        assert result.equals("Temperature reading is above the average") : "Test failed for white-box testing";

        // Enter inner if part
        result = TemperatureModule.compareTemperature(7.0, "Perth");
        assert result.equals("Temperature reading is above the average by more than 6 degrees") : "Test failed for white-box testing";

        // Enter inner else if part (else-if 1)
        result = TemperatureModule.compareTemperature(-3.0, "Perth");
        assert result.equals("Temperature reading is below the average") : "Test failed for white-box testing";

        // Enter outer else part
        result = TemperatureModule.compareTemperature(0.0, "Perth");
        assert result.equals("Temperature reading is at the average") : "Test failed for white-box testing";
    }
}




