public class homework6 {
    public static void main(String[] args){
        Music sen = new Music();
        System.out.print(sen.getInfo());
    }
}

class Music{
    String name = "陪伴";
    String time = "3分58秒";
    public String getInfo(){
        System.out.println("音乐开始播放");
        return "音乐的名字是" + name + "," + "音乐的时间是" + time;
    }
}