class Solution {
    public static void swap(int[]nums ,int num1,int num2){
        int temp=nums[num2];
        nums[num2]=nums[num1];
        nums[num1]=temp;
    }
    public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1;
        while(j<=k){
            if(nums[j]==0){
                swap(nums,j,i);
                i++;
                j++;
            }
            else if(nums[j]==2){
                swap(nums,j,k);
                k--;
            }else{
                j++;
            }
        }

    }
}