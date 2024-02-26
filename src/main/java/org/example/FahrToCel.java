package org.example;
public class FahrToCel {
    public static float fahrToCel(float f) {
        float c = (float) ((f - 32) * 5 / 9.0);
        return Math.round(c);
    }
    public static float kelvinToCel(float kel) {
        return (float) (kel - 273.15);
    }
}
