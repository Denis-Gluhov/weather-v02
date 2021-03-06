package denis.ru.weather.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Simpleforecast {

    @SerializedName("forecastday")
    @Expose
    private List<Forecastday_> forecastday = null;

    public List<Forecastday_> getForecastday() {
        return forecastday;
    }

    public void setForecastday(List<Forecastday_> forecastday) {
        this.forecastday = forecastday;
    }
}
