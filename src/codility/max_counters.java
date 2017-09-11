package codility;

import java.util.Arrays;

/**
 * calculate the values of counters after applying all alternating operations:
 * increase counter by 1; set value of all counters to current maximum.
 * 
 * @author xinghu
 * You are given N counters, initially set to 0, and you have two possible operations on them:

increase(X) − counter X is increased by 1,
max counter − all counters are set to the maximum value of any counter.
A non-empty zero-indexed array A of M integers is given. This array represents consecutive operations:

if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
if A[K] = N + 1 then operation K is max counter.
For example, given integer N = 5 and array A such that:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the values of the counters after each consecutive operation will be:

    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
The goal is to calculate the value of every counter after all operations.
 *
 */
public class max_counters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max_counters mc = new max_counters();
		int[] A = {3,4,4,6,1,4,6,4};
		System.out.println("sum "+Arrays.stream(A).max().getAsInt());
		int[] B = mc.solution(1, A);
		for(int item: B){
			System.out.println(item);
		}

	}
	
	public int[] solution(int N, int[] A) {
        int[] array = new int[N];
        int max = 0;
        int temp = 0;
        Arrays.fill(array, 0);
        for(int op:A){
        	if(op <= N){
        		array[op-1] = 1+ Math.max(max,array[op-1] ) ;
        		temp = Math.max(array[op-1], temp);
        	
        	}else{
        		max = temp;
        	}
        }
        System.out.println("max"+max);
        
        for(int i=0;i<array.length;i++){
        	array[i]=Math.max(max, array[i]);
        	System.out.println("after i:"+array[i]);
        }
        
        return array;
    }

}
