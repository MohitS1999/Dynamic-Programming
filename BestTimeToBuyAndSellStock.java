//Leetcode
import java.util.*;
public class BestTimeToBuyAndSellStock{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
			int n=sc.nextInt();
			int price[]=new int[n];
			for (int i=0;i<n;i++)
				price[i]=sc.nextInt();
			int maxValue=0;
			int minValue=price[0];
			for (int i=1;i<n;i++){
				//take small value from the array
				int diff=price[i]-minValue;
				if (diff<0){
					minValue=price[i];
					continue;
				}
				//take max value from the array 
				maxValue=Math.max(maxValue,diff);
			}
			System.out.println(maxValue);
		}
	}
}
