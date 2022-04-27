package hello;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unused")
public class mani {

	public static void main(String[] args) {
				
		List<Integer> number= new ArrayList<>();
		number.add(100);
		number.add(102);
		number.add(103);
		number.add(104);
		number.add(105);
		number.add(106);
		number.add(107);
		number.add(108);
		number.add(109);
		
		System.out.println(number);
		
		number.add(104);
		
		System.out.println(number);
		number.remove(5);
		System.out.println(number);

	}

}