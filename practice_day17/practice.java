//import java.util.Scanner;
//
//public class practice {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入该链表的长度");
//        int longs;
//        while (true) {
//            longs = myScanner.nextInt();
//            if (longs >= 1 && longs <= 100)
//                break;
//            else
//                System.out.println("输入错误请重新输入");
//        }
//        int arr[] = new int[longs];
//        int arr1[] = new int[longs];
//        for (int i = 0; i < arr.length; i++) {
//            while(true) {
//                arr[i] = myScanner.nextInt();
//                if (i == 0 && arr[i] == 0){
//                    System.out.println("输入错误请重新输入");
//                    continue;
//                }
//                if (arr[i] >= 0 && arr[i] <= 9){
//                    break;
//                }else
//                    System.out.println("输入错误请重新输入");
//            }
//
//        }
//        for (int j = 0; j < arr1.length; j++) {
//            while(true) {
//                arr1[j] = myScanner.nextInt();
//                if (j == 0 && arr1[j] == 0){
//                    System.out.println("输入错误请重新输入");
//                    continue;
//                }
//                if (arr1[j] >= 0 && arr1[j] <= 9){
//                    break;
//                }else
//                    System.out.println("输入错误请重新输入");
//            }
//        }
//        Solution sen = new Solution();
//        int arr2[] = sen.showarr(arr,arr1);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i] + ' ');
//        }
//    }
//}
//

//class Solution{
//    int num;
//    int num1;
//    int num2;
//    public int ListNode(int arr[],int arr2[]){
//        for (int i = arr.length -1; i >= 0; i++) {
//            num += arr[i] * Math.pow(10, i - 1);
//        }
//        for(int j = arr2.length -1; j >= 0; j++){
//            num1 += arr2[j] * Math.pow(10, j - 1);
//        }
//        num2 = num + num1;
//        return num2;
//    }
//    public int[] showarr(int sum){
//
//    }
//}


//import java.util.Scanner;
//
//
//public class practice {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入第一个链表的长度");
//        int longs;
//        while (true) {
//            longs = myScanner.nextInt();
//            if (longs >= 1 && longs <= 100)
//                break;
//            else
//                System.out.println("输入错误请重新输入");
//        }
//        int arr[] = new int[longs];
//        int arr1[] = new int[longs];
//        for (int i = 0; i < arr.length; i++) {
//            while(true) {
//                arr[i] = myScanner.nextInt();
//                if (i == 0 && arr[i] == 0){
//                    System.out.println("输入错误请重新输入");
//                    continue;
//                }
//                if (arr[i] >= 0 && arr[i] <= 9){
//                    break;
//                }else
//                    System.out.println("输入错误请重新输入");
//            }
//
//        }
//        System.out.println("请输入第二个链表的长度");
//        while (true) {
//            longs = myScanner.nextInt();
//            if (longs >= 1 && longs <= 100)
//                break;
//            else
//                System.out.println("输入错误请重新输入");
//        }
//        arr1 = new int[longs];
//        for (int j = 0; j < arr1.length; j++) {
//            while(true) {
//                arr1[j] = myScanner.nextInt();
//                if (j == 0 && arr1[j] == 0){
//                    System.out.println("输入错误请重新输入");
//                    continue;
//                }
//                if (arr1[j] >= 0 && arr1[j] <= 9){
//                    break;
//                }else
//                    System.out.println("输入错误请重新输入");
//            }
//        }
//        Solution sen = new Solution();
//        int arr2[] = sen.showarr(arr,arr1);
//        System.out.print("结果为：");
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i]);
//        }
//    }
//}
//
//class Solution{
//    public int[] showarr(int arr[],int arr1[]){
//        int arr2[] = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr2[i] = arr[i] + arr1[i];
//            if (arr2[i] >= 10){
//                if (i + 1 == arr.length){
//                    int arr3[] = new int[arr.length + 1];
//                    for(int j = 0;j < arr.length;j++){
//                        arr2[j] = arr3[j];
//                        arr3[arr.length] = 1;
//                        arr2 = arr3;
//                    }
//                }
//                arr2[i + 1] = arr[i + 1] + 1;
//                arr2[i] -= 10;
//            }
//        }
//        return arr2;
//    }
//}
//class Solution {
//    public int[] showarr(int arr[], int arr1[]) {
//        int len = Math.min(arr.length, arr1.length);
//        int[] arr2 = new int[len + 1];
//        for (int i = 0; i < len; i++) {
//            arr2[i] += arr[i] + arr1[i];
//
//        }
//    }

//}

import java.util.*;
public class practice {
    public static void main(String[] args) {

    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, maxLen = 0;
        while (j < s.length()) {
            char c = s.charAt(j);
            if (!set.contains(c)) {
                set.add(c);
                j++;
                maxLen = Math.max(maxLen, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLen;
    }
}