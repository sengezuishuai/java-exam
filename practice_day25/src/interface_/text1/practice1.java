package interface_.text1;

public class practice1 {
    public static void main(String[] args) {
        Cellphone arr = new Cellphone();
        arr.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("凌晨起床了");
            }
        });
        arr.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("asdadw");
            }
        });
    }
}
interface Bell{
    void ring();
}

class Cellphone{
    public void alarmclock(Bell ring){
        ring.ring();
    }
}
