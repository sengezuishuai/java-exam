//public class practice {
//    public static void main(String[] args) {
//        //System.out.print("hello world");
//        Mytools tiil = new Mytools();
//        int arr[] = {10, -1, 8, 0, 34};
//        tiil.bubble(arr);
//        System.out.print("===排列后的");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//    }
//}
//
//
//class Person{
//    String name;
//    int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
//class Mytools {
//    public void bubble(int[] arr) {
//        int temp = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//


public class practice {
    public static void main(String[] args) {
        Account sen = new Account();
        sen.setall("森frstfre哥",6,"fjdshfhjjkd");
        sen.showall();
    }
}






class Account{
    public String name = "皮卡丘";
    private double money = 23789;
    private String password = "sengezuishuai";

    public void setall(String name,double money,String password){
        this.name = getName(name);
        this.money = getMoney(money);
        this.password = getPassword(password);
    }

    public void showall(){
        System.out.println("他的名字是" + name + "," + "余额是"
                + money + ',' + "密码是" + password);
    }



    public String getName(String name) {
        if (name.length() > 1 && name.length() < 5)
            return name;
        else {
            System.out.println("你的输入长度过长或过短以输出默认值");
            return "皮卡丘";
        }
    }

    public double getMoney(double money) {
        if ((int)money >= 20.0)
            return money;
        else {
            System.out.println("你的输入小于20返回默认值");
            return 14250;
        }
    }

    public String getPassword(String password) {
        if (this.password.length() == 6)
            return this.password;
        else {
            System.out.println("你的输入有误以返回默认值");
            return "123456";
        }
    }
}
