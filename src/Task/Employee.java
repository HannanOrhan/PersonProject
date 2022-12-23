package Task;

public class Employee {

    private int year;
    private double price;
    //created

    public Employee(int year, double price) {
        setYear(year);
        setPrice(year);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
