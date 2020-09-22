class Solution {
    public int numberOfSteps (int num) {
     int sec = 0;
     while(num>0){
         
     if(num%2 !=0){
       num-=1;
       sec+=1;
     }
      else{
          
          num/=2;
          sec+=1;

      }
     }
      return sec;
    }
}
