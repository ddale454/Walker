import processing.core.PApplet;

public class Sketch extends PApplet {
    Walker walker;
    RandomDist randomDist;
    
    public void settings() {
        size(800, 500);
    }

    public void setup() {
        background(255, 255, 255);
        walker = new Walker(width/2, height/2);
        randomDist = new RandomDist();
    }

    public void draw() {
        // randomDist.getRandom(this);
        // randomDist.draw(this);
        walker.step(this);
        walker.draw(this);
    }
}