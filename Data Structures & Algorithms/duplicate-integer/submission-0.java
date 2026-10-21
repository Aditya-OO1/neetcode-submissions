class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> unq = new HashSet<>();

        for(int val : nums){

            if(unq.contains(val)){
                return true;
            } else{
            unq.add(val);

            }

        }
        return false;

        

        }

        


        
    }
