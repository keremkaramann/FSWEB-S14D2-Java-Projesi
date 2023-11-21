package workintech.composition;

public class Bed {
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(int pillows, int height, int sheets, int quilt) {
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
