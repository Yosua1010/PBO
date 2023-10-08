public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        super();
        height = 1.0;
    }
    public Cylinder(double height) {
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        super(radius, "red");
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    // Overriding metode getArea() untuk menghitung luas permukaan silinder
    @Override
    public double getArea() {
        // Menggunakan super.getArea() untuk mendapatkan luas dasar lingkaran
        double baseArea = super.getArea();
        // Menghitung luas permukaan silinder
        double sideArea = 2 * Math.PI * getRadius() * height;
        return 2 * baseArea + sideArea;
    }
    // Memperbaiki metode getVolume() setelah overriding getArea()
    public double getVolume() {
        return super.getArea() * height; // Menggunakan super.getArea()-
        //untuk mendapatkan luas dasar lingkaran
    }
    // Implementasi metode toString() untuk Cylinder
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
