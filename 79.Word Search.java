class Solution {
    public boolean exist(char[][] board, String word) {
        int k=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(k) && search(board,i,j,k,word)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean search(char[][] board,int i,int j,int k,String word){
        if(k==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length){
            return false;
        }
        if(board[i][j]!=word.charAt(k)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='*';
        if(search(board,i+1,j,k+1,word) ||
        search(board,i-1,j,k+1,word) ||
        search(board,i,j+1,k+1,word) ||
        search(board,i,j-1,k+1,word) ){
            return true;
        }
        board[i][j]=temp;

        return false;

    }
}
