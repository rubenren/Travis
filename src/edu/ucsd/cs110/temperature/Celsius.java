package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature {

    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit temp = new Fahrenheit(9 * this.getValue() / 5 + 32);

        return temp;
    }

    public String toString()
    {
        String retval = String.valueOf(this.getValue()) + " C";
        return retval;
    }
}
