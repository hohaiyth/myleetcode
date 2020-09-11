class Solution {
    public int lengthOfLongestSubstring(String s) {
    if(s.length() == 0) return 0;
    HashMap <Character,Integer>map = new HashMap <Character,Integer>();//建立哈希函数
     int max=0; //最长子串的长度
     int  left=0; //滑动窗口左下端,i是滑动窗口的右端
     for(int i=0;i<s.length();++i){
         if(map.containsKey(s.charAt(i))){   //其中，charAt是返回特定索引的字符值
             left = Math.max(left,map.get(s.charAt(i))+1);

         }
         map.put(s.charAt(i),i);  //更新map中a的映射
         max= Math.max(max,i-left+1);
     }
     return max;
    }
}
