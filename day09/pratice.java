//public class pratice {
//    public static void main(String[] args){
//        int num[][] = new int[10][10];
//        int count = 10;
//        int a = 1;
//        for (int i = 0;i < count;i++){
//            for (int j = 0;j < a;j++,a++){
//                if (j == 0 || j == (a - 1)){
//                    num[i][j] = 1;
//                }
//                if (i >= 3 && j > 0 &&j < a){
//                    num[i][j] = num[i - 1][j] + num[i - 1][j - 1];
//                }
//            }
//        }
//        a = 1;
//        for(int i = 0;i < count;i++){
//            for (int j = 0;j < a;j++,a++){
//                System.out.print(num[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}

//public class pratice {
//    public static void main(String[] args){
//        int num[][] = new int[10][10];
//        int count = 10;
//        for (int i = 0; i < count; i++){
//            for (int j = 0; j <= i; j++){
//                if (j == 0 || j == i){
//                    num[i][j] = 1;
//                }
//                if (i >= 2 && j > 0 && j < i){
//                    num[i][j] = num[i - 1][j] + num[i - 1][j - 1];
//                }
//            }
//        }
//        for (int i = 0; i < count; i++){
//            for (int j = 0; j <= i; j++){
//                System.out.print(num[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class pratice {
//    public static void main(String[] args){
//        int arr[] = {10,12,45,90};
//        int arr1[] = new int[arr.length + 1];
//        for (int i = 0;i < arr1.length;i++){
//            if (i == arr.length){
//                arr1[arr.length] = 23;
//                break;
//            }
//            arr1[i] = arr[i];
//        }
//        arr = arr1;
//        int a = 0;
//        for (int j = 0;j < arr.length - 1;j++) {
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    a = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = a;
//                }
//            }
//        }
//        for (int i = 0;i < arr.length;i++)
//            System.out.print(arr[i] + "\t");
//    }
//}

public class pratice {
    public static void main(String[] args){
        AA a = new AA();
        System.out.print(a.num(3));
    }
}

class AA{
    public boolean num(int num){
        if (num % 2 == 0)
            return true;
        else
            return false;
    }
}