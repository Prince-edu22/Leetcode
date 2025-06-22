class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
       long totalcount=0;
       int lastminindex=-1;
       int lastmaxindex=-1;
       int lastinvalidindex=-1; 
       for(int currindex=0;currindex<nums.length;++currindex){
        if(nums[currindex]<minK || nums[currindex]>maxK){
            lastinvalidindex=currindex;
        }
            if(nums[currindex]==minK){
               lastminindex=currindex; 
            } 
            if(nums[currindex]==maxK){
                lastmaxindex=currindex;
            }
            totalcount+=Math.max(0,Math.min(lastminindex,lastmaxindex)-lastinvalidindex);
        }
        return totalcount;
       }
    }
