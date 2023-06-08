class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      int right=matrix[0].length-1;
      int left =0;
      int top=0;
      int btm=matrix.length-1;
      List<Integer> list=new ArrayList<Integer>();

    while(top<=btm && left<=right){
      for(int i=left;i<=right;i++){
          list.add(matrix[top][i]);
      }
      top++;
      for(int i=top;i<=btm;i++){
          list.add(matrix[i][right]);
      }
        
      right--;

      if(top<=btm){
      for(int i=right;i>=left;i--){
          list.add(matrix[btm][i]);
      }
      btm--;
      }

      if(left<=right){
      for(int i=btm;i>=top;i--){
          list.add(matrix[i][left]);
      }
      left++;
      }
    }
    return list;
    }
}
