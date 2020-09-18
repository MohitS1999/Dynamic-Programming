import java.util.*;
public class CountSubsetSumBTT{
	public static void main(String[] arga){
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
			int n=sc.nextInt();
			int ar[]=new int[n];
			for (int i=0;i<n;i++)
				ar[i]=sc.nextInt();
			int sum=sc.nextInt();
			System.out.println(Subset(ar,n,sum));
		}
	}
	public static int Subset(int[] ar,int n,int S){
		int dp[][]=new int[n+1][S+1];
		for (int i=0;i<n+1;i++){
			dp[i][0]=1;
		}
		for (int i=1;i<=n;i++){
			for (int sum=1;sum<=S;sum++){
				dp[i][sum]=dp[i-1][sum];
				if (ar[i-1]<=sum)
					dp[i][sum]=dp[i-1][sum-ar[i-1]]+dp[i][sum];
			}
		}
		return dp[n][S];
	}
}