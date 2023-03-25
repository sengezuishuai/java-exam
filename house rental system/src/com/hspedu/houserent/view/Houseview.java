package com.hspedu.houserent.view;

import com.hspedu.houserent.domain.House;
import com.hspedu.houserent.service.HouseService;
import com.hspedu.houserent.utils.Utility;

/**
 * 1.显示界面
 * 2.接收用户输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */
public class Houseview {
    private boolean loop = true;//控制显示菜单的
    private char key = ' ';//接受用户选择菜单
    private HouseService houseService = new HouseService(10);//数组大小是0
    //编写listHouses（）显示房屋列表
    public void listhouse(){
        System.out.println("=============房屋列表=============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("==============房屋列表显示完毕==============");
    }
    public void update(){//根据ID修改房屋信息
        System.out.println("=========修改房屋信息===========");
        int updateId = Utility.readInt();
        if (updateId == -1){
            System.out.println("==========你放弃修改房屋信息=========");
            return;
        }
        House house = houseService.findById(updateId);
        if (house == null){
            System.out.println("你修改的房屋信息不存在");
            return;
        }
        System.out.println("姓名(" + house.getName() +")：");
        String name = Utility.readString(8,"");
        if (!"".equals(name)){//修改
            house.setName(name);
        }
        System.out.println("电话(" + house.getPhone() + ")：");
        String phone = Utility.readString(12,"");
        if (!"".equals(phone)){
            house.setPhone(phone);
        }
        System.out.println("地址(" + house.getAddress() + "):");
        String address = Utility.readString(18,"");
        if (!"".equals(address)){
            house.setAddress(address);
        }
        System.out.println("租金(" + house.getRent() + "):");
        int rent = Utility.readInt();
        if (!"".equals(rent)){
            house.setRent(rent);
        }
        System.out.println("状态("+ house.getState() + "):");
        String state = Utility.readString(3,"");
        if (!"".equals(state)){
            house.setState(state);
        }
        System.out.println("修改的房屋编号不存在");
    }
    public void findHouse(){//寻找房屋信息
        System.out.println("========查找房屋信息======");
        System.out.println("请输入要查找的ID");
        int find =Utility.readInt();
        //调用find方法
        House house = houseService.findById(find);
        if (house != null){
            System.out.println(house);
        }else {
            System.out.println("==========ID信息不存在=========");
        }
    }
    public void exit(){//退出
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }
    public void delHouse(){//编写delHouse（）接受输入的id，调用Service的del方法
        System.out.println("===========添加房屋信息==========");
        System.out.println("请输入待删房屋（-1表示退出）：");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("=======你放弃了删除房屋信息======");
            return;
        }

        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){//真的删除
            if (houseService.del(delId)){
                System.out.println("========删除房屋信息成功=======");

            }else {
                System.out.println("=========房屋编号不存在，失败======");
            }
        }else {
            System.out.println("==============放弃删除房屋信息===========");
        }
    }
    public void addHouse(){
        System.out.println("=================添加房屋=================");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("出租状态");
        String state = Utility.readString(3);
        //创建一个新的House对象，注意ID，那是系统分配的，用户不可以输入
        House house = new House(0,name,phone,address,rent,state);
        if (houseService.add(house)){
            System.out.println("=========添加房屋成功=======");
        }else {
            System.out.println("============添加房屋失败==========");
        }
    }
    //显示主菜单
    public void mainMeue(){
        do {
            System.out.println("===============房屋出租系统===============");
            System.out.println("\t\t\t1. 新 增 房 源");
            System.out.println("\t\t\t2. 查 找 房 源");
            System.out.println("\t\t\t3. 删 除 房 屋 信 息");
            System.out.println("\t\t\t4. 修 改 房 屋 信 息");
            System.out.println("\t\t\t5. 房 屋 列 表");
            System.out.println("\t\t\t6.退        出");
            System.out.println("\t\t\t请输入你的选择（1——6）");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listhouse();
                    break;
                case '6':
                    //这里使用Utility提供的方法，完成确实
                    exit();
                    break;

            }
        }while (loop);
    }
}
