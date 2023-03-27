package calculating_wages;//工资核算包

public class run {
    public static void main(String[] args) {
        General_staff staffs = new General_staff(200,"jack",30,1.0,0);
        manage manages = new manage(300,"dayh",30,1.2,0);
        staffs.info();
        manages.info();
    }
}
