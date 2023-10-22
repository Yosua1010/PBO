public class Paint {
    private double coverage; // jumlah kaki persegi yang dapat dicat oleh satu galon cat

    public Paint(double c) {
        coverage = c;
    }

    public double amount(Shape s) {
        double shapeArea = s.area();
        return shapeArea / coverage;
    }
}
