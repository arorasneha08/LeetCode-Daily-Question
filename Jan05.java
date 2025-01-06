
// Problem 2381. Shifting Letters II

public class Jan05 {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftAmounts = new int[n + 1]; 

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            shiftAmounts[start] += (direction == 1) ? 1 : -1;
            shiftAmounts[end + 1] += (direction == 1) ? -1 : 1;
        }

        int netShift = 0;
        char[] result = s.toCharArray();
        
        for (int i = 0; i < n; i++) {
            netShift += shiftAmounts[i];
            int shift = (netShift % 26 + 26) % 26; 
            result[i] = (char) ('a' + (result[i] - 'a' + shift) % 26);
        }
        return new String(result);
    }
}
