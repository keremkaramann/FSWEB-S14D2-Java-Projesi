import workintech.composition.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom1 = new Bedroom("Çalışma odası",
                new Wall("north"), new Wall("south"), new Wall("east"),
                new Wall("west"), new Ceiling(PaintColor.RED, 2),
                new Bed(2, 30, 190, 90),
                new Lamp(LampType.DESK_LAMP, false, 4),
                new Wardrobe(2, 180, 120.34),
                new Carpet(160, 80, PaintColor.GREEN));

    }

}