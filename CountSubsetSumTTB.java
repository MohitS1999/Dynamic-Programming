import java.util.*;
public class CountSubsetSumTTB{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0){
			int n=sc.nextInt();
			int ar[]=new int[n];
			for (int i=0;i<n;i++)
				ar[i]=sc.nextInt();
			int sum=sc.nextInt();
			int dp[][]=new int[n+1][sum+1];
			// for (int i=0;i<=n;i++)
				// dp[i][0]=1;
			System.out.println(Subset(ar,n,sum,dp));
		}
	}
	public static int Subset(int[] ar,int n,int sum,int[][] dp){
		if (sum==0) return 1;
		if (n==0 && sum!=0) return 0;					
		//Memorization
		//Dp converts the recursion 2^n complexity to Quadration complexity n^2
		if (dp[n][sum]!=0) return dp[n][sum];
		// if the the element is greater than the sum of subset
		if (ar[n-1] > sum)
			return dp[n][sum]=Subset(ar,n-1,sum,dp);
		return dp[n][sum]=(Subset(ar,n-1,sum-ar[n-1],dp)+Subset(ar,n-1,sum,dp));
	}
}
