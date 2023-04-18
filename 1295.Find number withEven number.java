class Solution {
    public int findNumbers(int[] nums) {
        
        int count=0;
        for(int i=0;i<nums.length;i++){
          if(isPrime(nums[i])){
              count++;
          }
      }
      return count;

    }

  static int even(int num){
      int count=0;
      if(num<0){
          return num=num*-1;
      }
      if(num==0){
          return 1;
      }
      while(num>0){
          count++;
          num=num/10;
      }
      return count;
  }
    boolean isPrime(int num){
        int number=even(num);
      return number%2==0;
  }
}
