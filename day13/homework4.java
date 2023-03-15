public class homework4 {
    public static void main(String[] args){
        double sum = 10;
        double sum2 = 5;
        int judge = 2;
        Cale sen3 = new Cale();
        System.out.print(sen3.calculate(sum,sum2,judge));

    }
}

class Cale{
    public double calculate(double sum,double sum2,int judge){
        while (true) {
            if (judge == 0) {
                return sum + sum2;
            }
            if (judge == 1) {
                return sum - sum2;
            }
            if (judge == 2) {
                return sum * sum2;
            }
            if (judge == 3) {
                if (sum2 == 0) {
                    System.out.print("除数为0");
                    return -1;
                }
                return sum / sum2;
            }
            System.out.print("请重新输入数字");
            return -1;
        }
    }
}