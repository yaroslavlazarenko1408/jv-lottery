package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    public Ball getRandomBall() {
        Random random = new Random();
        int randomInt = random.nextInt(MAX_BALL_NUMBER) + 1;
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), randomInt);
    }
}
