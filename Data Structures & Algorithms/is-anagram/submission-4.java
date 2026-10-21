class Solution {
    public boolean isAnagram(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        char[] c = t.toCharArray();
        char[] d = s.toCharArray();
        

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char val:a){
            if(map1.containsKey(val)){
                map1.put(val,map1.get(val)+1);
            } else{
                map1.put(val,1);
            }
        }

        for(char ele:b){
            if(map2.containsKey(ele)){
                map2.put(ele,map2.get(ele)+1);
            } else{
                map2.put(ele,1);
            }
        }

        for(char match : c){
            if(!map1.containsKey(match)||!map2.containsKey(match)){
                return false;}
                else{ 
                if(map1.containsKey(match)&&map2.containsKey(match)){
                if(!map1.get(match).equals(map2.get(match))){
                    return false;
                }
            }
        }


    }

    for(char match : d){
            if(!map1.containsKey(match)||!map2.containsKey(match)){
                return false;}
                else{ 
                if(map1.containsKey(match)&&map2.containsKey(match)){
                if(!map1.get(match).equals(map2.get(match))){
                    return false;
                }
            }
        }


    }


    return true;
}
}
