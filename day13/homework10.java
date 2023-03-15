public class homework10 {
    public static void main(String[] args){
        int num = 2;
        cai sen = new cai();
        switch (num) {
            case 0:
                if (sen.senge() == 0)
                    System.out.print("draw");
                else if (sen.senge() == 1)
                    System.out.print("win");
                else
                    System.out.print("lose");
                break;
            case 1:
                if (sen.senge() == 0)
                    System.out.print("lose");
                else if (sen.senge() == 1)
                    System.out.print("draw");
                else
                    System.out.print("win");
            case 2:
                if (sen.senge() == 0)
                    System.out.print("win");
                else if (sen.senge() == 1)
                    System.out.print("lose");
                else
                    System.out.print("draw");
        }
    }
}

class cai{
    public int senge(){
        return (int)(Math.random() * 3);
    }
}