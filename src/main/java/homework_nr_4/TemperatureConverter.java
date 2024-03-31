package homework_nr_4;

public class TemperatureConverter {

    float celsius;
    float fahrenheit;

    public TemperatureConverter(float celsius, float fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public static double toCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double toFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }


    public static void main(String[] args) {
        int celsiusTemp = -17;
        int fahrenheitTemp = 2;

        double convertedToFahrenheit = toFahrenheit(celsiusTemp);
        System.out.println(celsiusTemp + "\"C is equal to " + convertedToFahrenheit + "\"F");
        System.out.println("--------------------------------------");

        double convertedToCelsius = toCelsius(fahrenheitTemp);
        System.out.println(fahrenheitTemp + "\"F is equal to " + convertedToCelsius + "\"C");
    }
}
