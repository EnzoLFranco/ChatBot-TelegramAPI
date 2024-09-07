import java.util.Map;

public class SampleTools {
    public static String getCurrentFuelPrice(Map<String, Object> input) {
        String location = (String) input.get("location");
        String fuelType = (String) input.get("fuelType");
        return "O preço atual do " + fuelType + " em " + location + " é R$ 5,50.";
    }
    public static String getWeatherForecast(Map<String, Object> input) {
        String location = (String) input.get("location");
        return "A previsão do tempo para " + location + " é sol com poucas nuvens.";
    }
}
