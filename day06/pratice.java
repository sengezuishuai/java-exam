//public class pratice {
//    public static void main(String[] args){
//        for(int i = 1;i <= 5; i++){
//            for(int j = 1;j <= i;j++)
//                System.out.print("*");
//            System.out.println();
//        }
//    }
//}
//public class pratice {
//    public static void main(String[] args){
//        for(int i = 1;i <= 5;i++){
//            for(int j = 1;j <= 9;j++){//这个如果可以定义常量就ok了
//                if(j <= 5 - i || j >= 5 + i) {
//                    System.out.print(" ");
//                }
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

public class pratice {
    public static void main(String[] args){
        int a = 20;
        for (int j = 1;j <= a;j++){
            for (int i = 1;i <= 2 * a - 1;i++){
                if(j < a) {
                    if (i == a - (j - 1) || i == a + (j - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
