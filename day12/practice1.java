public class practice1 {
    public static void main(String[] args){
        char chars[] = {'d','t','u','t','p'};
        char search = 'k';
        A02 sen1 = new A02();
        System.out.print(sen1.find(search,chars));
    }
}

class A02{
    public int find(char aim,char char1[]){
        for (int i = 0;i < char1.length;i++){
            if (char1[i] == aim){
                return i + 1;
            }
        }
        return -1;
    }
}

