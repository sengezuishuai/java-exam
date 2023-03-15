public class homework3 {
    public static void main(String[] args){
        double r = 234;
        Circle sen2 = new Circle();
        System.out.print(sen2.area(r));
    }
}

class Circle{
    public double area(double r){
        double area1 = 3.1415926 * r * r;
        return area1;
    }
}
