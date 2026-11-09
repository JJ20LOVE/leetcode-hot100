public class hot9 {

    public static void main(String[] args) {


    }
    public int subarraySum(int[] nums, int k) {

        int result=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>k) continue;
            int add=nums[i];
            int j=i;
            while(add<=k){
                if(j!=nums.length-1) add+=nums[++j];
                if(add==k){
                    result++;
                }
            }

        }
        return result;
    }
}
