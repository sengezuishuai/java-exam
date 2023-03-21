package com.m4a1;

public class test {
    public static void main(String[] args) {
        Employee employee[] = new Employee[3];
        employee[0] = new Employee("jack",10000);
        employee[1] = new Manage("senge",100000,
                10000);
        employee[2] = new Staff("wangke",5000);
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] instanceof Manage){
                Manage manage = (Manage) employee[i];
                manage.info();
                manage.manage();
            } else if (employee[i] instanceof Staff) {
                Staff staff = (Staff) employee[i];
                staff.info();
                staff.work();
            }
        }
    }
}
