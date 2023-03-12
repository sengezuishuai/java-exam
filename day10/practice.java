public class practice {
    public static void main(String[] args) {
        int n = 3; // 塔的高度
        char from = 'A'; // 起始塔
        char to = 'C'; // 目标塔
        char via = 'B'; // 中间塔
        hanoi(n, from, to, via); // 调用递归函数求解
    }

    /**
     * 求解汉诺塔问题的递归函数
     * @param n 汉诺塔的高度
     * @param from 起始塔
     * @param to 目标塔
     * @param via 中间塔
     */
    public static void hanoi(int n, char from, char to, char via) {
        if (n == 1) { // 当塔高度为1时，直接将盘子从起始塔移动到目标塔
            System.out.println("Move disk from " + from + " to " + to);
        } else { // 当塔高度大于1时，先将上面n-1个盘子从起始塔移动到中间塔，再将最下面一个盘子从起始塔移动到目标塔，最后将中间塔上的n-1个盘子移动到目标塔
            hanoi(n - 1, from, via, to); // 递归调用函数，将上面n-1个盘子从起始塔移动到中间塔
            System.out.println("Move disk from " + from + " to " + to); // 将最下面一个盘子从起始塔移动到目标塔
            hanoi(n - 1, via, to, from); // 递归调用函数，将中间塔上的n-1个盘子移动到目标塔
        }
    }
}