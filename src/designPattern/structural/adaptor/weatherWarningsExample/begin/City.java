package designPattern.structural.adaptor.weatherWarningsExample.begin;

public interface City {

  String getName();
  double getTemperature();
  String getTemperatureScale();
  boolean getHasWeatherWarning();
  void setHasWeatherWarning(boolean hasWeatherWarning);


}
