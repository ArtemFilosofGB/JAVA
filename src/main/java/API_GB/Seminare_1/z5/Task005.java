
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
package API_GB.Seminare_1.z5;

public class Task005 {
    public static void main(String[] args) {
        int[] arr={3,1,2,10,1};
        int[] result= new int[arr.length];
        result[0]=arr[0];

        for (int i = 1; i < result.length; i++) {
            result[i]+= arr[i]+result[i-1];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("result[i] = " + result[i]);

        }

    }
}
