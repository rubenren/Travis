package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{

    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Celsius temp = new Celsius((this.getValue() - 32) * 5 / 9);
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        String retval = String.valueOf(this.getValue()) + " F";
        return retval;
    }
}
