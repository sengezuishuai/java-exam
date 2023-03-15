public class homework2 {
    public static void main(String[] args){
        A03 sen = new A03();
        int arr[] = {3,5,73,53,53};
        arr = sen.copyArr(arr);
        for (int i = 0;i < arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}

class A03{
    public int[] copyArr(int arr[]){
        int newarr[] = arr;
        return newarr;
    }
}