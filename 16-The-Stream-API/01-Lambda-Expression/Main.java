package LambdaExpression;

interface LightAction {
    void run();
}

public class Main {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Lights ON due to motion");
        LightAction night = () -> System.out.println("Dim lights for night");
        LightAction voice = () -> System.out.println("Lights ON by voice command");

        motion.run();
        night.run();
        voice.run();
    }
}
