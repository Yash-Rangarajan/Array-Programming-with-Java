/*
Input:
[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]
Output:
[1, 2, 3, 6, 9, 8, 7, 4, 5]
*/

/*To create a spiral matrix,follow this order.
First row[increment], last column[decrement], last row[decrement],first column[increment]*/

public class SpiralMatrix{
   
    public int[] spiralOrder(final int[][] A) {
           int i,j,
           int k = 0, l = 0,z=0; // row, column and output array  loop variables
           int m = A.length;
           int n =A[0].length;
           int []B= new int [m*n];
        while (k < m && l < n)
        {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i)
            {
                B[z++]=A[k][i];
            }
            k++; // Increment starting row number
  
            // Print the last column from the remaining columns 
            for (i = k; i < m; ++i)
            {
                B[z++]=A[i][n-1];
            }
            n--; // decrement end column number
  
            // Print the last row from the remaining rows */
            if ( k < m)
            {
                for (i = n-1; i >= l; --i)
                {
                    B[z++]=A[m-1][i];
                }
                m--; // decrement end row number
            }
  
            // Print the first column from the remaining columns */
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
                    B[z++]=A[i][l];
                }
                l++;   // increment starting column number 
            } 
        }
        return B;
    }
     
    }

