class Solution {
    public int[] productExceptSelf(int[] nums) {


        // List<Integer> result = new ArrayList<>();


        // for(int i=0;i<nums.length;i++){
        //     int ans = 1;

        //     for(int j=0;j<nums.length;j++){
        //         if(j!=i){

        //             ans = ans*nums[j];


        //         }
                
        //     }

        //     result.add(ans);


        // }

        // int[] output = new int[result.size()];
        // for (int i = 0; i < result.size(); i++) {
        //     output[i] = result.get(i);
        // }

        // return output;

        int n = nums.length;

        int[] before = new int[n];
        int[] after = new int[n];
        int[] output = new int[n];

        before[0] = 1;
        for (int i = 1; i < n; i++) {
            before[i] = before[i - 1] * nums[i - 1];
        }

        after[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            after[i] = after[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            output[i] = before[i] * after[i];
        }

        return output;







        
    }
}  
