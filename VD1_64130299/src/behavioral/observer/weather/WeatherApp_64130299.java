package behavioral.observer.weather;

public class WeatherApp_64130299 implements Observer_64130299{
    private String appName;

    public WeatherApp_64130299(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String weatherUpdate) {
        System.out.println(appName + " recieve weather update: " + weatherUpdate);
    }
}
