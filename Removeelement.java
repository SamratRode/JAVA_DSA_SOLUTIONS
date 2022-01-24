class Solution {
    public int removeElement(int[] nums, int val) {
        int temp=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
                // temp=nums[nums.length-1];
                nums[nums.length-1]=nums[i];
                for(int j=i+1;j<nums.length;j++){
                    nums[j-1]=nums[j];
                    
                    
                }
                nums[nums.length-1]=nums[i];
                
                
            }
        }
        for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]);}
        
        System.out.println(count);
        return count;
        
    }
}
