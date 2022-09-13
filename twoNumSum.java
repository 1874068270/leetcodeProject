public class twoNumSum {
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]+nums[j]==target){
                    indexs[0]=i;
                    indexs[1]=j;
                    return indexs;
                }
            }
        }
        return indexs;

    }
}
