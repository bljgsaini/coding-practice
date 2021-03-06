package dynamicProgramming;

public class UnboundedKnapsack {
	
	public static void main(String args[]) {
		
	}

	
	public static int unBoundedKnapsack(int wt[], int val[], int n, int W) {
		
		if(W == 0 || n==0 ) return 0;
		
		if(wt[n-1] <= W) {
			return Math.max( val[n-1] + unBoundedKnapsack(wt, val, n, W-wt[n-1]) , unBoundedKnapsack(wt, val, n-1, W));
		}
		return unBoundedKnapsack(wt, val, n-1, W);
		
	}
	
	public static int unBoundedKnapsackTopDown(int wt[], int val[], int n, int W) {
		
		int t[][] = new int[n+1][W+1];
		
		for(int i=0; i<=n; i++) {
			t[i][0] = 0;
		}
		
		for(int i=0; i<=W; i++) {
			t[0][i] = 0;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=W; j++) {
				if(wt[i-1] <= j) {
					t[i][j] = Math.max(val[i-1]+t[i][j-wt[i-1]], t[i-1][j]);
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		return t[n][W];
	}
	
}
