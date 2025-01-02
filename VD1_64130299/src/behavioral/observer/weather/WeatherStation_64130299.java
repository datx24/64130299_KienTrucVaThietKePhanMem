package behavioral.observer.weather;

public class WeatherStation_64130299 extends Subject_64130299 {
    private String weatherCondition;

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
        System.out.println("Weather Station: Weather changed to " + weatherCondition);
        notifyObserver(weatherCondition);
    }
}
