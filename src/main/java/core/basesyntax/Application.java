package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        Lottery lottery = new Lottery();
        balls[0] = lottery.getRandomBall();
        balls[1] = lottery.getRandomBall();
        balls[2] = lottery.getRandomBall();
        for (Ball ball : balls) {
            System.out.println(ball.toString());
        }
    }
}
