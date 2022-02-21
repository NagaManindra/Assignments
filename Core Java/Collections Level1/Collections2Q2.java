import java.util.HashSet;
import java.util.Set;

public class Collections2Q2 {

	public static void main(String[] args) {
				
		Set<Integer> number= new HashSet<>();
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

	}

}
