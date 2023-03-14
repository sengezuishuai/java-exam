public class practice {
    public static void main(String[] args){
         double num[] = {37,73,19,26,83,27,18,9,734,840};
         A01 sen = new A01();
         System.out.print(sen.max(num));
    }
}

class A01{
    public double max(double num1[]){
        double a = num1[0];
        for (int i = 0;i < num1.length - 1;i++){
            if (num1[i + 1] > a)
                a = num1[i + 1];
        }
        return a;
    }
}
