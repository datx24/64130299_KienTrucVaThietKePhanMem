package behavioral.observer.weather;

public class WeatherTest_64130299 {
    public static void main(String[] args) {
        WeatherStation_64130299 weatherStation_64130299 = new WeatherStation_64130299();

        WeatherApp_64130299 app1 = new WeatherApp_64130299("App 1");
        WeatherApp_64130299 app2 = new WeatherApp_64130299("App 2");
        WeatherApp_64130299 app3 = new WeatherApp_64130299("App 3");
        weatherStation_64130299.addObserver(app1);
        weatherStation_64130299.addObserver(app2);

        weatherStation_64130299.notifyObserver("Sunny");
        weatherStation_64130299.notifyObserver("Rainny");

        weatherStation_64130299.removeObserver(app1);

        weatherStation_64130299.notifyObserver("Stormy");

        weatherStation_64130299.addObserver(app3);

        weatherStation_64130299.notifyObserver("Cloudy");
    }
}
