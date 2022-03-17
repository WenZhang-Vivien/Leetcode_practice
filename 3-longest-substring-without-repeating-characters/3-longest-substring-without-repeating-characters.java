class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<String> count_list = new ArrayList<String>();
        // HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        for (int j = 0; j < s.length(); j++){
            // if (s.length()==1){
            //     return 1;
            // }
            String temp_str = "";
            Set<String> s1 = new HashSet<>();
            for (int i = j; i < s.length(); i++){
                char ele = s.charAt(i);
                String ele_int = String.valueOf(ele);
                temp_str = temp_str + ele_int;
                if (!s1.contains(ele_int)){
                    s1.add(ele_int);
                    count_list.add(temp_str.substring(0, temp_str.length()));
                } else {
                    count_list.add(temp_str.substring(0, temp_str.length()-1));
                    break;
                }
            }
        }
        int str_len = 0;
        for (int n = 0; n < count_list.size(); n++){
            int str_len_temp = count_list.get(n).length();
            // System.out.println(str_len_temp);
            if (str_len_temp > str_len){
                str_len = str_len_temp;
            }
        }
        return str_len;
        
        
    }
}