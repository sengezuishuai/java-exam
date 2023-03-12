//import java.util.Scanner;
//import java.util.Scanner;
//public class pratice1 {
//    public static void main(String[] args){
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入年龄");
//        int age = myScanner.nextInt();
//        if(age >= 18){
//            System.out.println("你年龄大于18 TM要自己负责");
//        }else {
//            System.out.println("没有18呀那算了");
//        }
//    }
//}
//
//import java.util.Scanner;
//public class pratice1{
//    public static void main(String[] args){}
//    Scanner myScanner = new Scanner(Ststem.in);
//    System.out.println("jkfhwjkefh");
//    int age = myScanner.nextInt();
//    import java.util.Scanner;
//    Scanner myScanner = new Scanner(System.in);
//
//        }

//import java.util.Scanner;
//public class pratice1 {
//    public static void main(String[] args){
//        Scanner myScanner = new Scanner(System.in);
//        int age = myScanner.nextInt();
//        char www = myScanner.next().charAt(0);
//    }
//}

import java.util.Scanner;
public class pratice1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int mounth = Scanner.nextInt();
        int age = Scanner.nextInt();
        if (mounth >= 4 && mounth <= 10) {
            if (age >= 18 && age <= 60) {
                System.out.println("60");
            } else if (age < 18) {
                System.out.println("30");
            } else
                System.out.println("20");
        } else {
            if (age >= 18 && age <= 60) {
                System.out.println("40");
            } else
                System.out.println("20");
        }
    }
}