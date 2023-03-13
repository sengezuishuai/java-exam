import java.util.Scanner;
public class practice {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int m = myScanner.nextInt();
                sen a = new sen();
        System.out.print(a.tao((10 - m)));
    }
}

class sen{
    public int tao(int n){
       if (n == 0){
           return 1;
       }else{
           return (tao(n - 1) + 1) * 2;
       }
    }
}
//public class practice {
//
//    public static void main(String[] args) {
//        int n = 3; // n表示盘子的个数
//        char A = 'A', B = 'B', C = 'C'; // A、B、C分别表示三个柱子
//
//        // 调用递归函数实现汉诺塔问题的求解
//        hanoi(n, A, B, C);
//    }
//
//    // 递归函数，实现汉诺塔问题的求解
//    public static void hanoi(int n, char A, char B, char C) {
//        if (n == 1) {
//            System.out.println(A + "->" + C);
//        } else {
//            hanoi(n-1, A, C, B); // 将A柱上的n-1个盘子移动到B柱上
//            System.out.println(A + "->" + C); // 将A柱上剩余的一个盘子移动到C柱上
//            hanoi(n-1, B, A, C); // 将B柱上的n-1个盘子移动到C柱上
//        }
//    }
//
//}
//上面的代码实现了汉诺塔问题的求解，其中，hanoi函数是一个递归函数，用于将A柱上
// 的n个盘子移动到C柱上。当n等于1时，直接将一个盘子从A柱移动到C柱；当n大于1
// 时，将A柱上的n-1个盘子先移动到B柱上，然后将A柱上剩余的一个盘子移动到C柱
// 上，最后将B柱上的n-1个盘子移动到C柱上。递归过程中，每次移动都是通过将问
// 题分解成子问题来实现的，直到问题规模为1时结束递归。
 




