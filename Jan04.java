
// Problem 1930. Unique Length-3 Palindromic Subsequences

import java.util.HashSet;

public class Jan04 {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> set = new HashSet<>(); 
        int n = s.length() ; 
        for(int i = 0; i< n ; i++){
            set.add(s.charAt(i));
        }
        int count = 0 ; 
        for(Character ch : set){
            int first = -1; 
            int last = -1 ;
            for(int i = 0 ; i < n ; i++){
                if(s.charAt(i) == ch){
                    if(first == -1){
                        first = i ; 
                    }
                    last = i ; 
                }
            }
            HashSet<Character> unique = new HashSet<>(); 
            for(int j = first + 1 ; j < last ; j ++){
                unique.add(s.charAt(j)); 
            }
            count += unique.size(); 
        }
        return count ; 
    }
}
