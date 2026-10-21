class Solution {
    public int[] topKFrequent(int[] nums, int k) {


        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a:nums){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            } else{
                map.put(a,1);

            }
        }

       int[] result = new int[k];

for (int i = 0; i < k; i++) {
    int bestKey = 0;
    int bestCount = 0;

    for (int key : map.keySet()) {
        if (map.get(key) > bestCount) {
            bestCount = map.get(key);
            bestKey = key;
        }
    }

    result[i] = bestKey;
    map.remove(bestKey);
}

return result;

    }}