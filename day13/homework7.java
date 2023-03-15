public class homework7 {
    public static void main(String[] args){
        A04 sen = new A04();
        System.out.print(sen.method(sen.method(10.0,20.0),100));
    }
}

class A04{
    public double method(double a,double b){
        return a + b;
    }
}