import java.util.*;
public class CountingBits{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0){
			int n=sc.nextInt();
			int ar[]=new int[n+1];
			ar=counting(n);
			for (int i=0;i<n+1;i++){
				System.out.print(ar[i]+" ");
			}
			System.out.println();
		}
	}
	public static int[] counting(int n){
		int ar[]=new int[n+1];
		if (n==0) return ar;
		
		ar[0]=0;
		ar[1]=1;
		if (n==1){
			return ar;
		}
		for (int i=2;i<=n;i++){
			//int x=(int)(Math.log(i)/Math.log(2));
			//int pow=(int)Math.pow(2,x);
			//System.out.print(pow+" "+(i-pow)+" , ");
			//right shift operator does i divide with 2^i
			if (i%2==1)
				ar[i]=ar[i>>1]+1;
			else 
				ar[i]=ar[i>>1];
		}
		//System.out.println();
		return ar;
	}
}