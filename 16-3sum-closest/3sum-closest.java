class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closetSum=1<<30;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }
             if (Math.abs(sum - target) < Math.abs(closetSum - target)) {
               closetSum = sum;
                }
                if(sum>target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return closetSum;
    }
}