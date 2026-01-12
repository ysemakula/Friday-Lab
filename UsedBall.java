public class UsedBall {
    public static void main(String[] args) {
        String [] ballMsgs = {"Yes", "No", "Sort of", "Maybe", "Definitely no", "Definitely yes"};
        MagicBall ball1 = new MagicBall(ballMsgs, "Red", 0);
        MagicBall ball2 = new MagicBall(ballMsgs, "Blue");
        MagicBall ball3 = new MagicBall(ballMsgs);

        for(int i = 1; i <= 5; i++) {
            ball3.shake();
            System.out.println(ball3);
        }
        System.out.println();

        RgbColor c3 = new RgbColor(255, 0, 0, 1.0, "Red");
        RgbColor c2 = new RgbColor(255, 255, 255, 0.5);
        RgbColor c1 = new RgbColor(255, 255, 255);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
