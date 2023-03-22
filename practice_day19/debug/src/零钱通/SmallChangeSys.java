package 零钱通;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        double money = 0;
        double balance = 0;
        Date date = null;
        String details = null;
        String note = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化
        do{
            System.out.println("============零钱通菜单===========");
            System.out.println("\t\t\t1。零钱通明细");
            System.out.println("\t\t\t2。收 益 入 账");
            System.out.println("\t\t\t3。消     费");
            System.out.println("\t\t\t4.退    出 ");
            System.out.print("请选择(1 - 4):");
            key = scanner.next();
            switch (key){
                case "1":
                    System.out.println("1 零钱通明显");
                    break;
                case "2":
                    System.out.print("2 收  益  入  账");
                    money = scanner.nextDouble();
                    date = new Date();//获取当前的日期
                    balance += money;
                    //拼接收益入账信息到details
                    details += "\t收益入账\t" + money + '\t' + sdf.format(date) + '\t' + balance;
                    break;
                case "3":
                    System.out.println("3 消         费");
                    money = scanner.nextDouble();
                    System.out.println("消费说明");
                    note = scanner.next();
                    balance -= money;
                    details += "\t收益入账\t-" + money + '\t' + sdf.format(date) + '\t' + balance;
                    break;
                case "4":
                    System.out.println("4 退         出");
                    break;
                default:
                    System.out.println("选择有误重新选择");
            }
        }while(loop);
    }
}
