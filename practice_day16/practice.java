public class practice {
    public static void main(String[] args) {
        int num[] = {1,4,6,7};
        int target = 10;
        Solution sen = new Solution();
        int arr[] = new int[2];
        arr = sen.twoSum(num,target);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int arr[] = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for(int j = 0;j < nums.length;j++){
//                if (nums[i] + nums[j] == target && i != j){
//                    arr[0] = i;
//                    arr[1] = j;
//                }
//            }
//        }
//        return arr;
//    }
//}

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int arr[] = new int[2];
//
//        return arr;
//    }
//}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}

