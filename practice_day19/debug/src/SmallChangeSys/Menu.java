package SmallChangeSys;

//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Scanner;
//
//public class menu {
//    boolean loop = true;
//    Scanner scanner = new Scanner(System.in);
//    String key = "";
//    double money = 0;
//    double balance = 0;
//    Date date = null;
//    String details = null;
//    String note = null;
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//
//    public void mainMeun() {
//        System.out.println("显示零钱通菜单...");
//    }
//
//    public void detail(){
//        do {
//            System.out.println("============零钱通菜单===========");
//            System.out.println("\t\t\t1。零钱通明细");
//            System.out.println("\t\t\t2。收 益 入 账");
//            System.out.println("\t\t\t3。消     费");
//            System.out.println("\t\t\t4.退    出 ");
//            System.out.print("请选择(1 - 4):");
//            key = scanner.next();
//            switch (key){
//                case "1":
//                    System.out.println(details);
//                    break;
//                case "2":
//                    this.income();
//                    break;
//                case "3":
//                    this.pay();
//                    break;
//                case "4":
//                    this.exit();
//                    break;
//                default:
//                    System.out.println("字符输入有误");
//                    break;
//            }
//
//        }while(loop);
//    }
//
//    public void income(){
//        System.out.print("收益入账金额");
//        money = scanner.nextDouble();
//        if (money <= 0){
//            System.out.println("收益入账金额需要大于0");
//            return;
//        }
//        balance += money;
//        date = new Date();
//        details += "\n收益入账\t" + money + '\t' +sdf.format(date) + '\t' +balance;
//        System.out.println(details);
//    }
//
//    public void pay(){
//        System.out.print("消费金额");
//        money = scanner.nextDouble();
//        if (money <= 0||money > balance) {
//            return;
//        }
//        System.out.print("消费说明");
//        note = scanner.next();
//        balance -= money;
//        date = new Date();
//        details += "\t消费支出\t" + note + '\t' + money + '\t' + sdf.format(date) + '\t' + balance;
//        System.out.println(details);
//    }
//    public void exit() {
//        String choice = "";
//        while (true) {
//            System.out.println("你确定要退出吗");
//            choice = scanner.next();
//            if (choice.equals("n")||choice.equals("y")){
//                break;
//            }
//        }
//        if (choice.equals("y")){
//            loop = false;
//        }
//    }
//}


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    double money = 0;
    double balance = 0;
    Date date = null;
    String details = "";
    String note = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void mainMenu() {
        System.out.println("======零钱通菜单======");
        System.out.println("1. 查看零钱通明细");
        System.out.println("2. 收益入账");
        System.out.println("3. 消费");
        System.out.println("4. 退出");
        System.out.print("请选择(1-4)：");
    }

    public void detail() {
        while (loop) {
            mainMenu();
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println("======零钱通明细======");
                    System.out.println(details);
                    break;
                case "2":
                    income();
                    break;
                case "3":
                    pay();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("选择有误，请重新输入！");
                    break;
            }
        }
    }

    public void income() {
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("金额必须大于0！");
            return;
        }
        balance += money;
        date = new Date();
        details += "收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance + "\n";
        System.out.println("收益入账成功！");
    }

    public void pay() {
        System.out.print("消费金额：");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("余额不足或输入金额不合法！");
            return;
        }
        System.out.print("消费说明：");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "消费支出\t" + note + "\t" + money + "\t" + sdf.format(date) + "\t" + balance + "\n";
        System.out.println("消费成功！");
    }

    public void exit() {
        String choice = "";
        while (true) {
            System.out.print("确定要退出吗？(y/n)：");
            choice = scanner.next();
            if (choice.equals("y") || choice.equals("n")) {
                break;
            }
            System.out.println("选择有误，请重新输入！");
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
