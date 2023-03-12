//public class pratice1 {
//    public static void main(String[] args){
//        for (int i = 5;i <= 10;i++){
//            System.out.println((int)(Math.random() * 100));
//        }
//    }
//}

//public class pratice1 {
//    public static void main(String[] args){
//        int num1 = 0;
//        while(true){
//            int num = (int)(Math.random()*100);
//            num1++;
//            if(num == 67)
//                break;
//        }
//        System.out.print(num1);
//    }
//}

//public class pratice1 {
//    public static void main(String[] args){
//        int j = 0;
//        for (int i = 1 ; i <= 100 ; i++){
//            j += i;
//            if(j > 20)
//            {
//                System.out.println(i);
//                break;
//            }
//        }
//    }
//}

import java.util.Scanner;
public class pratice1 {
    public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    for(int i = 1; i <= 3; i++) {
        String name = myScanner.next();
        String password = myScanner.next();
        if("丁真".equals(name)  && "666".equals(password))
        {
            System.out.println("登陆完成");
            break;
        }
        System.out.println("你还有" + (3 - i) + "次机会");
    }

    }
}