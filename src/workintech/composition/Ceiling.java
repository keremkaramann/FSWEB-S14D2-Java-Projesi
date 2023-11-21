package workintech.composition;

public class Ceiling {
    PaintColor paintedColor;
    private int height;

    public Ceiling(PaintColor paintedColor, int height) {
        this.paintedColor = paintedColor;
        this.height = height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public int getHeight() {
        return height;
    }
    public void create(){
        System.out.println("Painted Color: " + paintedColor +" Height: "+ height);
    }
}
