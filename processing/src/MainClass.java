import processing.core.PApplet;

public class MainClass extends PApplet {
    public static PApplet processing;

    public static void main(String[] args) {

        PApplet.main("MainClass", args);


    }

    public void setup() {
        processing = this;
    }

    public void draw() {
        //line(5,5,50,50);
        Circle2 c = new Circle2();
        c.draw();
    }

    class Circle {
        public void draw () {
            line(5,5,50,50);
        }
    }
}
