package finalTest;

public class circle {
    private final double PI = 3.14;
    private double r;
    //get/set
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    //计算面积
    public double getArea(){
        return PI * r * r;
    }
    //计算周长
    public double getPerimeter(){
        return 2 * PI * r;
    }
}
