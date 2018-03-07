/*Test case: Input : [(0, 0), (1, 1), (1, 2)]
  Output : 2
  1 step from 00 to 11. Another from 11 to 22. */
  
public class minStepsInfGrid {
    public int coverPoints(int[] A, int[] B) {
        int res=0;
        for(int i=0; i<A.length-1;i++)
        {
            int X= Math.abs(A[i]-A[i+1]); // X coordinate distance between points on X axis.
            int Y= Math.abs(B[i]-B[i+1]); // Y coordinate distance between points on Y axis.
            res+= Math.max(X,Y); // Maximum among the 2 distances is the number of steps taken.
        }
        return res;
    }
}
