/*Input  : [7, 3, 16, 10]
Output : 3  
As Number of integers greater than 3
is three.

Input  : [-1, -9, -2, -78, 0]
Output : 0
As Number of integers greater than 0
is zero.*/
public class NobleInt {
    public int solve(int[] A) {
        Arrays.sort(A); //sort the array
        int n= A.length;
        // 
        for(int i=0; i<n-1; i++)
        {
            if(A[i] == A[i+1])// if two numbers are equal,skip the comparision. Continue takes the loop to the next iteration.
                continue;
                
            if(A[i] == n - i - 1) // check for program logic.
                return A[i]; 
        }
        
        if(A[n-1]==0)
        return A[n-1];
        else
        return -1;
    }
}

