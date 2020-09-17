class Solution {
    public int game(int[] guess, int[] answer) {
    
     int cur =0;
     for(int i=0;i<3;i++){
        
         if (guess[i]==answer[i])
         cur+=1;
     }
     return cur;
    }
  }
