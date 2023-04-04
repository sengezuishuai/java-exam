package com.sen.homework1;

import java.util.concurrent.Callable;

//public class homework {
//    public static void main(String[] args) {
//        double a = 10;
//        double b = 20;
//        double c = new Cellphone().work(a,b);
//        System.out.println(c);
//    }
//}
//
//class Cellphone implements compulter{
//    public void testWork(double a,double b){
//        work(a,b);
//    }
//}
//
//interface compulter{
//    public default double work(double a, double b){
//        return a + b;
//    }
public class homework {
    public static void main(String[] args) {
       Cellphone cellphone =new Cellphone();
        cellphone.testword(new compulture() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,8);{;

        }
    }
}

interface compulture{
    public double work(double n1,double n2);

}
class Cellphone{
    public void testword(compulture Compulture,double a,double b){
        double c = Compulture.work(a,b);
        System.out.println(c);
    }
}