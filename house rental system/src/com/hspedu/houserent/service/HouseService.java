package com.hspedu.houserent.service;

import com.hspedu.houserent.domain.House;

/**
 * HouseService.java类[业务层]
 * 定义House[],保存House对象
 * 响应HouseView的调用
 * 完成对房屋信息的各种操作（增删改查）
 */
public class HouseService {
    private House[] houses;//保存house对象
    private int houseNums = 1;//记录当前有几个房屋信息
    private int idCounter = 1;//记录当前ID的自增长到那个值
    public HouseService(int size){
        //new houses
        houses = new House[size];
        houses[0] = new House(1,"jack","121","海淀区",2000,"为出租");
    }
    public House[] list(){//list方法返回house
        return houses;
    }
    //find方法，返回house对象或null
    public House findById(int findID){
        //遍历
        for (int i = 0; i < houseNums; i++) {
            if (findID == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
    public boolean del(int delId){//del方法，删除一个房屋信息

        //应当找到删除的房屋信息对应的下标
        //下标和房屋编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()){//要删除的房屋ID，是数组下标为i的元素
                index = i;//index记录i
            }
        }
        if (index == -1){//说明delID在数组里面不存在
            return false;
        }
        for (int i = 0; i < houseNums; i++) {
            houses[i] = houses[i + 1];
        }
        houses[houseNums] = null;
        houseNums--;
        return true;//把当前存在的最后一个元素滞空；
    }

    public boolean add(House newHouse){//添加新对象
        //判断是否可以继续添加（暂时不考虑扩容）
        if (houseNums == houses.length){//不考虑添加了
            System.out.println("数组已满，不考虑添加");
            return false;
        }
        // 把newhouse对象加入到数组的最后
        houses[houseNums++] = newHouse;
        //设置一个ID自增长
        idCounter++;
        newHouse.setId(idCounter);
        return true;
    }
}
