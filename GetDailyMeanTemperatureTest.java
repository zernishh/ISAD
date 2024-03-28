public class GetDailyMeanTemperatureTest {

    public static void main(String[] args) {
        testCityPerth();
        testCityDubai();
        testInvalidCity();
    }

    private static void testCityPerth() {
        String city = "Perth";
        double expectedTemperature = 18.2;
        double actualTemperature = TemperatureModule.getDailyMeanTemperature(city);
        assert actualTemperature == expectedTemperature : "Test failed for valid city Perth";
        System.out.println("Test passed for valid city Perth");
    }

    private static void testCityDubai() {
        String city = "Dubai";
        double expectedTemperature = 26.9;
        double actualTemperature = TemperatureModule.getDailyMeanTemperature(city);
        assert actualTemperature == expectedTemperature : "Test failed for valid city Dubai";
        System.out.println("Test passed for valid city Dubai");
    }

    private static void testInvalidCity() {
        String city = "Paris";
        try {
            TemperatureModule.getDailyMeanTemperature(city);
            // If the exception is not thrown, the test should fail
            assert false : "Test failed for invalid city Paris";
        } catch (IllegalArgumentException e) {
            System.out.println("Test passed for invalid city Paris");
        }
    }
}

