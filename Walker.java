import processing.core.PApplet;
import java.util.Random;

public class Walker {
    private int x, y;

    public Walker(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(PApplet surface) {
        surface.stroke(0);
        surface.point(x, y);
    }

    public void step(PApplet surface) {
        Random rng = new Random();
        // generates random floats in the interval (-1, 1)
        // float stepX = -1 + rng.nextFloat() * 2;

        // float stepY = -1 + rng.nextFloat() * 2;

        // int stepX = (int) surface.random(3) - 1;
        // int stepY = (int) surface.random(3) - 1;
        float stepX = surface.random(-1, 1);
        float stepY = surface.random(-1, 1);
        x += stepX;
        y += stepY;
    }
}