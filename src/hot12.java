public class hot12 {
    public static void main(String[] args) {

    }

    public void rotate(int[] nums, int k) {

        int [] arr=  new int[nums.length];
        arr=nums;
        for (int i = 0; i < nums.length; i++) {
            if(i-k>=0){
            nums[i]=arr[i-k];}
            else{
                nums[i]=arr[nums.length+i-k];
            }
        }
    }

}
