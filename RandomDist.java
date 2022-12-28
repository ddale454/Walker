import processing.core.PApplet;
import java.util.Random;

public class RandomDist {
    private final double[] BINS = {-1, -0.75, -0.5, -0.25, 0, 0.25, 0.5, 0.75, 1};
    private int[] randomCounts;

    public RandomDist() {

        randomCounts = new int[BINS.length - 1];
    }

    public void getRandom(PApplet surface) {
        double num = surface.random(-1, 1);
        int bin = getBin(num);
        randomCounts[bin]++;
    }

    public int getBin(double num) {
        int bin = 0;
        for (int i = 0; i < BINS.length - 1; i++) {
            if (num < BINS[i]) {
                bin = i;
                break;
            }
        }

        return bin;
    }

    public void draw(PApplet surface) {
        surface.stroke(0);
        surface.fill(175);
        int width = surface.width / randomCounts.length;

        for (int i = 0; i < randomCounts.length; i++) {
            surface.rect(i * width, surface.height - randomCounts[i], width, randomCounts[i]);
        }
    }
}