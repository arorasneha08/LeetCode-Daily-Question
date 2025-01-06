
// Problem : 2559. Count Vowel Strings in Ranges

import java.util.Arrays;
import java.util.HashSet;

public class Jan02 {
    private static boolean startsOrEndsWithVowel(String word, HashSet<Character> set){
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        if(set.contains(first) && set.contains(last)) return true ;
        return false; 
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = queries.length ; 
        int result[] = new int[n]; 
        int prefSum[] = new int[words.length]; 
        HashSet<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u')); 

        for(int i = 0; i< words.length ; i++){
            if(startsOrEndsWithVowel(words[i] , set)){
                prefSum[i] = 1 ; 
            }
            if(i > 0){
                prefSum[i] += prefSum[i-1] ; 
            }
        }

        for(int i = 0; i < n ; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            if(left == 0){
                result[i] = prefSum[right]; 
            }
            else{
                result[i] = prefSum[right] - prefSum[left-1];
            }
        }
        return result ; 
    }
}
