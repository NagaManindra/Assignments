import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
public class Collection2Q4 {

	public static void main(String[] args) {
		List<String> date = new LinkedList<>();
		date.add("23-12-2000");
		date.add("23-12-2001");
		date.add("23-12-2002");
		date.add("23-12-2003");
		date.add("23-12-2004");
		date.add("23-12-2005");
		date.add("23-12-2006");
		date.add("23-12-2007");
		date.add("23-12-2008");
		date.add("23-12-2009");
		
		for(String it : date) {
			String[] strings = it.split("-");
			if((int)Integer.parseInt(strings[2])%4==0) {
				if((int)Integer.parseInt(strings[2])%100==0) {
					if((int)Integer.parseInt(strings[2])%400==0)
						System.out.println("Your Date of Birth is "+it+" it was Leap Year");
					else {
						System.out.println("Your Date of Birth is "+it+" it was not Leap Year");
					}
				}
				else {
					System.out.println("Your Date of Birth is "+it+" it was Leap Year");
				}
				
			}
			else {
				System.out.println("Your Date of Birth is "+it+" it was not Leap Year");
			}
		}

	}

}
**/
public class Collection2Q4 {

	public static void main(String[] args) {
		LocalDate obj1 = LocalDate.of(2000,03, 23);
		LocalDate obj2 = LocalDate.of(2001,03, 23);
		LocalDate obj3 = LocalDate.of(2002,03, 23);
		LocalDate obj4 = LocalDate.of(2003,03, 23);
		LocalDate obj5 = LocalDate.of(2004,03, 23);
		LocalDate obj6 = LocalDate.of(2005,03, 23);
		LocalDate obj7 = LocalDate.of(2006,03, 23);
		LocalDate obj8 = LocalDate.of(2007,03, 23);
		LocalDate obj9 = LocalDate.of(2008,03, 23);
		LocalDate obj0 = LocalDate.of(2009,03, 23);
		
		List<LocalDate> list = new LinkedList<>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		list.add(obj6);
		list.add(obj7);
		list.add(obj8);
		list.add(obj9);
		list.add(obj0);
		for(LocalDate it:list) {
			if(it.isLeapYear()) {
				System.out.println("Your Date of Birth is "+it+" it was Leap Year");
			}
			else {
				System.out.println("Your Date of Birth is "+it+" it was not Leap Year");
			}
		
	}
}
	}

