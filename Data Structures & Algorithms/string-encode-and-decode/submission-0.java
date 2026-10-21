class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for(String word :strs){
            sb.append(word.length());
            sb.append("#");
            sb.append(word);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {


        List<String> result = new ArrayList<>();

        int i =0;

        while(i<str.length()){

            int index = str.indexOf("#",i);
            int ln = Integer.parseInt(str.substring(i,index));

            String word = str.substring(index+1,index+1+ln);

            result.add(word);

            i = index+1+ln; 

        }

        return result;

    }
}
