package collections.arrays;


/**
 * 
 * @author srini
 * 
 * Arrays will store data of same type
 * we use indices as keys
 * we can use random becuase of keys  : getItem(int index) - it is very fast O(1)
 * 
 *  Disadvantage: 
 *  - we have to know size of array while creating
 * - if it is full we need to create a bigger array and need to copy values one by one => reconstructing a array is O(N) 
 * - can't store different types of values
 * ###########################
 *			 Add - constant time complexity O(1)
 *			insert - adding at end O(1) 
 *					 if it is at first linear time complexity ~O(N) = some time we need to shift lot of values while insert
 *			Remove - if it is last item O(1) but if it is first O(N)
 *			
 * 
 */

public class MyArrays {

	public static void main(String[] args) {

		
		int[] nums = new int[5];
		
		for(int i=0; i<nums.length;i++)
			nums[i]=i*5;
		
		//o(1) random index
		int num = nums[2];
		System.out.println(num);
		
		//O(N) linear search -> O(logN) binary trees -> o(1) hashtables
		for(int i=0; i<nums.length;i++)
			if(nums[i]==20)
				System.out.println("index found " + i);
		

	}

}
