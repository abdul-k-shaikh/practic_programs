package com.test.array;

public class Duplicate {

//	public static void main(String[] args) {
////		Scanner sc = new Scanner(System.in);
////		int n=sc.nextInt();
////		int ar[]=new int[n];
////		for(int i=0; i<n; i++) {
////			ar[i]=sc.nextInt();
////		}
//		
//		//ip:1 2 5 2 6 1 7
//		// 1 2
//		
//		List<Integer> li = new ArrayList<>(asList(1,2,3));
//		li.add(null)
//
//	}
	

	 
    static int uniquePathsWithObstacles(int[][] A)
    {
 
        int r = A.length;
        int c = A[0].length;
 
        // If obstacle is at starting position
        if (A[0][0] != 0)
            return 0;
 
        //  Initializing starting position
        A[0][0] = 1;
 
        // first row all are '1' until obstacle
        for (int j = 1; j < c; j++) {
 
            if (A[0][j] == 0) {
                A[0][j] = A[0][j - 1];
            }
            else {
                // No ways to reach at this index
                A[0][j] = 0;
            }
        }
 
        // first column all are '1' until obstacle
        for (int i = 1; i < r; i++) {
 
            if (A[i][0] == 0) {
                A[i][0] = A[i - 1][0];
            }
            else {
                // No ways to reach at this index
                A[i][0] = 0;
            }
        }
 
        for (int i = 1; i < r; i++)
        {
 
            for (int j = 1; j < c; j++)
            {
               
                // If current cell has no obstacle
                if (A[i][j] == 0) {
 
                    A[i][j] = A[i - 1][j] + A[i][j - 1];
                }
                else {
                    // No ways to reach at this index
                    A[i][j] = 0;
                }
            }
        }
 
        // returning the bottom right
        // corner of Grid
        return A[r-1][c-1];
    }
 
  // Driver code
    public static void main(String[] args)
    {
//        int[][] A
//            = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
    	
    	int[][] A = {{0,0,0},{0,1,0},{0,0,0}};
 
        System.out.print(uniquePathsWithObstacles(A));
    }





//public static void main(String[] args) {
//	MyClass1 obj = new MyClass1();
//	int m = 4;
//	int n = 5;
//	System.out.println(obj.numberOfPaths(m, n));
//}

////public int numberOfPaths(int m, int n) {
//	
////	int arr[][] = new int[m][n];
////	
////	for(int i=0;i<m;i++) {
////		arr[i][0] = 1;
////	}
////	
////	for(int i=0;i<n;i++) {
////		arr[0][i] = 1;
////	}
//	int l = 0;
//	if (m>n) {
//		l=m;
//	}else l=n;
////	
//	int[] a = new int[l];
//	for(int i=0;i<l;i++) {
//		a[i] = 1;
////		System.out.println(a[i]);
//	}
//	
//	
//	for(int i=0;i<m-1;i++) {
//		for(int j=1;j<n;j++) {
//			a[j] += a[j-1]; 
//			System.out.println("step: "+a[j]);
//		}
//	}
//	return a[n-1];
//	
////	int arr[][] = new int[m][n];
////	
////	for(int i=0;i<m;i++) {
////		arr[i][0] = 1;
////	}
////	
////	for(int i=0;i<n;i++) {
////		arr[0][i] = 1;
////	}
////	
////	for(int i=1;i<m;i++) {
////		for(int j=1;j<n;j++) {
////			arr[i][j] = arr[i-1][j] + arr[i][j-1];
////		}
////	}
////	return arr[m-1][n-1];
//	
////	int path = 1;
////	if(m==1 || n==1) {
////		path = 1;
////	}
////	
////	for(int i=n;i<(m+n-1);i++) {
////		path *= i;
////		path /= (i-n+1);
////	}
////	return path*(-1);
////	return numberOfPaths(m-1,n) + numberOfPaths(m,n-1);
////}


}
