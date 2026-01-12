public class RgbColor {
    private int red, green, blue;
    private double alpha;
    private String colorName;

    public RgbColor(int red, int green, int blue, double alpha, String colorName) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
        this.colorName = colorName;
    }

    public RgbColor(int red, int green, int blue, double alpha) {
        this(red, green, blue, alpha, "Unsure");
    }

    public RgbColor(int red, int green, int blue) {
        this(red, green, blue, 1.0, "Unsure");
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public String toString() {
        return"(r= " +red +",g= " + green + ",b= " + blue + ",a= " + alpha + ",c= " + colorName + ")";
    }
}
