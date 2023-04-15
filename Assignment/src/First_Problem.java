import java.util.*;

public class First_Problem {
	/*1. How do you sort an array in Java without using sort method ?
		input {1,-1, 0, 3,-4,7}
		o/p {-1,-4,0,1,7} */
	public static void main(String[] args) {

		List<Integer> list= Arrays.asList(1,-1, 0, 3,-4,7);
		Set<Integer> input = new TreeSet<>(list);

		System.out.println(input);

	}}
