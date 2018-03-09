/*If the vector has [0,1, 2, 3]
the returned vector should be [1, 2, 4]
as 123 + 1 = 124.
If the vector has [9, 9, 9]
the returned vector should be [1,0,0,0]
as 999 + 1 = 1000.*/

public class AddOneToArray {
    public int[] plusOne(int[] A) {
        int zeroCount = 0;
        boolean doweneedExtraone = true;
        boolean stopCountingZeroes = true;
        
  //Run the entire length of the string, check if we need an extra bit to store a 1,while simultaneously counting insignificant zeroes. 
        for(int i =0; i<A.length; i++)
        {
           if(A[i] == 0 && stopCountingZeroes)
           {
                zeroCount++;   
           }
           else if(A[i] != 9)
           {
               doweneedExtraone = false;
               stopCountingZeroes = false;
           }
           else
           {
               stopCountingZeroes = false;
           }
        }
        
        int size = A.length - zeroCount + (doweneedExtrabit ? 1: 0); // dynamically sizing output array
        int[] result = new int[size];
        int carry = 1; 
        //for loop performs addition. Note that  the loop wil run from result[size-1] till result[1].
        for(int i = A.length -1 ; i>=0 && size>0; size--, i-- )
        {
            result[size-1] = (A[i]+carry)%10;
            carryForward = (A[i]+carry)/10;

        }
        // if we need an extra one, asssign 1 to zeroth index of output array.
        if(doweneedExtraone)
        {
            ret[0] = 1 ;
        }
        
        return result;
    }
}
