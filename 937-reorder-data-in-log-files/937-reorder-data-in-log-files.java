class Solution {
    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> digList = new ArrayList<String>();
        ArrayList<String> letterList = new ArrayList<String>();

        String[] newLogs = new String[logs.length];
        for (String log: logs){
            String firstStr = log.split(" ",2)[1];
            if (Character.isDigit(firstStr.charAt(0))){
            // if (firstStr.charAt(0)>= '0' && firstStr.charAt(0)<= '9'){
                digList.add(log);
            } else {
                letterList.add(log);
            }
        }
        
        Collections.sort(letterList, new Comparator<String>(){
            public int compare(String s1, String s2){
                String[] sp1 = s1.split(" ", 2);
                String[] sp2 = s2.split(" ", 2);
                return (sp1[1].compareTo(sp2[1]) == 0)? sp1[0].compareTo(sp2[0]) : sp1[1].compareTo(sp2[1]);
            }
            
        });
        
        letterList.addAll(digList);
        letterList.toArray(newLogs);
        
        
        return newLogs;
    }
}