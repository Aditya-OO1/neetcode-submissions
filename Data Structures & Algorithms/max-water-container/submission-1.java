class Solution {
    public int maxArea(int[] heights) {


        // int max =0;


        // for(int i =0;i<heights.length-1;i++){

            
        //     for(int j =i+1;j<heights.length;j++){

        //         int diff = j-i;

        //         int ht = Math.min(heights[i],heights[j]);

        //         int area = diff*ht;

        //         if( area > max){
        //             max = area;
        //         }


        //     }
        // }


        // return max;


        int max = 0;

        int left = 0;
        int right = heights.length - 1;

        while (left < right) {

            int width = right - left;

            int ht = Math.min(heights[left], heights[right]);

            int area = width * ht;

            if (area > max) {
                max = area;
            }

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;


        



    }
}
