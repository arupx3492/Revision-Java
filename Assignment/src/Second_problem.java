import java.util.*;

public class Second_problem {
	/*2. How do you find the second largest number in an array in Java without using sort method ?
	input - {1,-1, 0, 3,-4,7}
	o/p - 3 */

	public static void main(String[] args) {

		List<Integer> list= Arrays.asList(1,-1, 0, 3,-4,7);
		Set<Integer> input = new TreeSet<>(list);
        int count=0;
		for(int s:input){
			count++;
			if(count==input.size()-1){
				System.out.println(s);
			}


		}


	}
}
