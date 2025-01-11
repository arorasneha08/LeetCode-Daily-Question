
// Problem 1400. Construct K Palindrome Strings

import java.util.HashMap;
import java.util.Map;

public class Jan11 {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) return false; 
        HashMap<Character, Integer> mpp = new HashMap<>(); 

        for(int i = 0 ; i< s.length() ; i++){
            mpp.put(s.charAt(i) , mpp.getOrDefault(s.charAt(i) , 0) + 1) ; 
        }

        int oddCount = 0 ; 
        for(Map.Entry<Character , Integer> entry : mpp.entrySet()){
            int freq = entry.getValue(); 
            if(freq % 2 != 0){
                oddCount ++ ; 
            }
        }
        return oddCount <= k ; 
    }
}
