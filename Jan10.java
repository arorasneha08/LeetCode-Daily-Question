
// Problem 916. Word Subsets

import java.util.ArrayList;
import java.util.List;

public class Jan10 {
    private static int[] countFrequency(String word){
        int freq[] = new int[26]; 
        for(char ch : word.toCharArray()){
            freq[ch - 'a'] ++ ; 
        }
        return freq ; 
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>() ; 
        int n = words1.length ;
        int m = words2.length ; 
        int maxFreq[] = new int[26] ;

        for(int i = 0 ; i< m ; i++){
            int freq[] = countFrequency(words2[i]);
            for(int j = 0 ; j< 26 ; j++){
                maxFreq[j] = Math.max(maxFreq[j], freq[j]); 
            }
        }

        for(int i = 0 ; i< n ; i++){
            int freq[] = countFrequency(words1[i]); 
            boolean isUniversal = true; 
            for(int j = 0 ; j< 26 ; j++){
                if(freq[j] < maxFreq[j]){
                    isUniversal = false ; 
                    break ; 
                }
            }
            if(isUniversal){
                res.add(words1[i]); 
            }
        }
        return res;
    }
}
