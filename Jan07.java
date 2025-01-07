
// Problem 1408. String Matching in an Array

import java.util.ArrayList;
import java.util.List;

public class Jan07 {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>(); 
        int n = words.length ; 
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j< n ; j++){
                if(i != j && words[j].contains(words[i])){
                    res.add(words[i]);
                    break ; 
                }
            }
        }
        return res; 
    }
}
