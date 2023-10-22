public class Commission extends Hourly {
    private double totalSales;
    private final double commissionRate;

    public Commission(String name, String address, String phone,
            String socialSecurityNumber, double hourlyPayRate,
            double commissionRate) {
        super(name, address, phone, socialSecurityNumber, hourlyPayRate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double hourlyPay = super.pay();
        double commissionPay = totalSales * commissionRate;
        totalSales = 0; // Reset total sales
        return hourlyPay + commissionPay;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: $" + totalSales;
    }
}
