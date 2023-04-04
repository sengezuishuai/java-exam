
public class enmu1 {
    public static void main(String[] args) {

    }
}

class Season{
    private String name;
    private String desc;

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    public static Season  adsd = new Season("dh","dhyu");

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
