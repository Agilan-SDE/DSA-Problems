package recursion;

import java.util.ArrayList;

public class Nqueens {
	
	static ArrayList<ArrayList<Integer>> N = new ArrayList<>();
	 public static ArrayList<ArrayList<Integer>> totalNQueens(int n) {
         int row=0;
       int col=0;
       int[][] chess = new int[n][n];
       
       solution(chess,0,new ArrayList<Integer>());
       return N;
   }
   // User function Template for Java
  

   
   public static void solution(int[][] chess,int row,ArrayList<Integer> M){
       
       if(row==chess.length){
           ArrayList<Integer> O = new ArrayList<Integer>();
           for(int i:M){
               O.add(i+1);
           }
          N.add(O);
          return;
       }
       
       for(int col=0;col<chess.length;col++){
           
           if(isSafe(chess,row,col)){
               chess[row][col]=1;
               M.add(col);
               solution(chess,row+1,M);
               chess[row][col]=0;
               M.remove(M.size()-1);
           }
       }
   }
   public static boolean isSafe(int[][] chess,int row,int col){
       
       for(int i=0;i<row;i++){
           if(chess[i][col]==1){
               return false;
           }
       }
       
       for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
           if(chess[i][j]==1){
               return false;
           }
       }
       
       for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
           if(chess[i][j]==1){
               return false;
           }
       }
       
       return true;
   }
   
   public static void main(String[] args) {
	int n=2;
	ArrayList<ArrayList<Integer>> I = totalNQueens(n);
	
	System.out.println(I.size()>=1 ? I.size():0);
}

}
