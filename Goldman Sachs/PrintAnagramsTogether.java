class Solution {
    
    public String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        
        List<List<String>> ans = new ArrayList<>();
        
        HashMap<String, ArrayList<String>> hs = new HashMap<>();
        
        for(String s : string_list)
        {
            String st = sortString(s);
            
            if(!hs.containsKey(st))
            {
                ArrayList<String> ls = new ArrayList<>();
                ls.add(s);
                hs.put(st, ls);
            }else{
                ArrayList<String> temp = hs.get(st);
                temp.add(s);
                hs.put(st, temp);
            }
        }
        
         for (Map.Entry mapElement : hs.entrySet()) {
            ans.add((List<String>)mapElement.getValue());
        }
        return ans;
        
        
    }
}
