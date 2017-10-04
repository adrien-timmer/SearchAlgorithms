package RandomSearch;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StochasticSearch {

    private Random random = new Random();
    private static final double START_X = -2;
    private static final double END_X = 2;

    private double f(double x) {
        return (x + 1) * (x + 1) - 3;
    }

    public void stochasticSearch() {
        double startingPointX = START_X;
        double min = f(startingPointX);
        double minX = START_X;

        for (int i = 0; i < 10000; ++i) {
            double randomX = ThreadLocalRandom.current().nextDouble(START_X, END_X);

            if (f(randomX) < min) {
                min = f(randomX);
                minX = randomX;
            }
        }

        System.out.println("Min value is f(x) = " + min + " the x point = " + minX);
    }
}
