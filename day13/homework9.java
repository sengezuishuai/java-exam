//public class homework9 {
//    public static void main(String[] args){
//        Circle1 c = new Circle1();
//        PrintObject sen = new PrintObject();
//        sen.printAreas(c, 5);
//    }
//}
//
//class Circle1{
//    public double findArea(double radius){
//        return radius * radius * 3.1415926;
//    }
//}
//
//class PrintObject {
//    public void printAreas(Circle1 c,int time){
//        System.out.println("Radius" + '\t' + '\t' + '\t' + "Area");
//        for (int i = 1;i <= time;i++){
//            System.out.println(time + '\t' + '\t' + '\t' + c.findArea(i));
//        }
//    }
//}

public class homework9 {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        PrintObject sen = new PrintObject();
        sen.printAreas(c, 5);
    }
}

class Circle1 {
    public double findArea(double radius) {
        return radius * radius * 3.1415926;
    }
}

class PrintObject {
    public void printAreas(Circle1 c, int time) {
        System.out.println("Radius" + ' ' + "Area");
        for (int i = 1; i <= time; i++) {
            System.out.println(i + ' ' + c.findArea(i));
        }
    }
}