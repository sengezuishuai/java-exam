package com.sen.enum_;

public class enums {
    public static void main(String[] args) {
        Week weeks[] = Week.values();
        for (Week week : weeks){
            System.out.println(week);
        }
    }
}

enum  Week{
    MONDAY("星期一"),TUESDAY("xqe");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }

}
