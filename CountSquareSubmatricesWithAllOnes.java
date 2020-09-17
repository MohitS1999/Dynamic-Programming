//https://leetcode.com/problems/count-square-submatrices-with-all-ones/submissions/
import java.util.*;
public class CountSquareSubmatricesWithAllOnes{
	//static int totalSquare;
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
			int row=sc.nextInt();
			int col=sc.nextInt();
			int totalSquare=0;
			int mat[][]=new int[row][col];
			for (int i=0;i<row;i++){
				for (int j=0;j<col;j++){
					mat[i][j]=sc.nextInt();
				}
			}
			int dp[][]=new int[row+1][col+1];
			findSquareSubmatrices(mat,row,col,dp);
			// for (int i=0;i<=row;i++){
				// for (int j=0;j<=col;j++){
					// System.out.print(dp[i][j]+"  ");
				// }
				// System.out.println();
			// }
			//find all the square submtrices
			for (int i=1;i<=row;i++){
				for (int j=1;j<=col;j++){
					totalSquare+=dp[i][j];
				}
				
			}
			System.out.println(totalSquare);
		}
	}
	public static int findSquareSubmatrices(int[][] mat,int row,int col,int[][] dp){
		if (row==0 || col==0) return 0;
		if (dp[row][col]!=0) return dp[row][col];
		if (mat[row-1][col-1]==0)
			return dp[row][col]=0;
		else{
			return 	dp[row][col]=Math.min(findSquareSubmatrices(mat,row-1,col-1,dp),Math.min(findSquareSubmatrices(mat,row-1,col,dp),findSquareSubmatrices(mat,row,col-1,dp)))+1;
		}
	}	
}
