package com.adrient.BruteForce;

public class BruteForce {

    private static final double START_X = -1;
    private static final double END_X = 2;

    public double f(double x) {
        return (x - 1) * (x - 1);
    }

    public void bruteForceSearch() {
        double startinPointX = START_X;
        double min = f(startinPointX);
        double dx = 0.01;
        double minX = START_X;

        for (double i = startinPointX; i < END_X; i += dx) {
            if (f(i) < min){
                min = f(i);
                minX = i;
            }
        }

        System.out.println("Min value is f(x) = " + min + " and x = " + minX);

    }
}
