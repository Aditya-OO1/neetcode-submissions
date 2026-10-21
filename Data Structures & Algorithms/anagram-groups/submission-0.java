class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for( String word:strs){

            char[] c = word.toCharArray();

            Arrays.sort(c);

            String Key = new String(c);

            if(!map.containsKey(Key)){
                map.put(Key,new ArrayList<>());
            }

            map.get(Key).add(word);


        }

        return new ArrayList<>(map.values());



        
    }
}
