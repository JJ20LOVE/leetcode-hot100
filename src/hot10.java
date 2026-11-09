public class hot10 {

    public int maxSubArray(int[] nums) {

        int result=nums[0];
        int current=nums[0];
        for(int i=0;i<nums.length;i++){
            current= Math.max(nums[i],nums[i]+current);
            result=Math.max(current,result);
        }
        return result;
    }
}
