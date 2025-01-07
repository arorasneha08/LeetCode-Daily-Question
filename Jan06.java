
// Problem 1769. Minimum Number of Operations to Move All Balls to Each Box

public class Jan06 {
    public int[] minOperations(String boxes) {
        int balls = 0 ; 
        int moves = 0 ;
        int n = boxes.length() ; 
        int res[] = new int[n]; 
        for(int i = 0 ; i<n ; i++){
            res[i] += moves ;
            if(boxes.charAt(i) == '1'){
                balls ++ ; 
            } 
            moves += balls; 
        }
        moves = 0 ;
        balls = 0 ; 
        for(int i = n-1 ; i>= 0 ;i--){
            res[i] += moves ; 
            if(boxes.charAt(i) == '1'){
                balls ++ ;
            }
            moves += balls; 
        }
        return res ;
    }
}
