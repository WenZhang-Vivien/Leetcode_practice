class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();

        String[] paragraphStr = normalizedStr.split("\\s+");
        HashMap<String, Integer> wordsHash= new HashMap<String, Integer>();
        for (String word : paragraphStr){
            if(wordsHash.containsKey(word)){
                int count = wordsHash.get(word);
                wordsHash.put(word, count+1);
            } else{
                wordsHash.put(word, 1);
            }
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<HashMap.Entry<String, Integer>>(wordsHash.entrySet());
        
        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> map1, Map.Entry<String, Integer> map2){
                return map2.getValue().compareTo(map1.getValue());
            }
        });
        
        String words = "";
        for (int i = 0 ; i < list.size(); i++){
            String a = list.get(i).getKey();
            if (!Arrays.asList(banned).contains(a)){
                words = a;
                break;
            }
        }
        
        return words;    
        
    }
}