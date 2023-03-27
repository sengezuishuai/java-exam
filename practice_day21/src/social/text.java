package social;

public class text {
    public static void main(String[] args) {
        Peasant peasant = new Peasant("jack",100);
        peasant.info();
        Scientist scientist = new Scientist("senge",300,15000);
        scientist.info();
        Worker worker = new Worker("bittrr",200);
        worker.info();
        Teacher teacher = new Teacher("张俊丽",150,40);
        teacher.info();
        Waiter waiter = new Waiter("tom",180);
    }
}
