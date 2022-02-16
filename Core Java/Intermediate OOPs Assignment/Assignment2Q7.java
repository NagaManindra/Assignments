import java.util.ArrayList;
import java.util.List;

abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
	List<String> candy = new ArrayList<>();
	public List<String> addItem(String item) {
		candy.add(item);
		System.out.println("Candies list :");
		return candy;
	}
    public static int addCandies(int candies){
    	return candies;
    }

	@Override
	public int getCost() {
		return addCandies( );
	}
}
class Cookie extends DesertItem {
	List<String> cooky = new ArrayList<>();
	public List<String> addItem(String item) {
		cooky.add(item);
		System.out.println("Candies list :");
		return cooky;
	}
    public static int addCookies(int candies){
    	return candies;
    }

	@Override
	public int getCost() {
		return 0;
	}
}
class IceCream extends DesertItem {
	List<String> iceCream = new ArrayList<>();
	public List<String> addItem(String item) {
		iceCream.add(item);
		System.out.println("Candies list :");
		return iceCream;
	}
    public int addIceCreams(int candies){
    	return candies;
    }

	@Override
	public int getCost() {
		return addIceCreams(getCost());
	}
}
public class Assignment2Q7 {
    public static void main(String[] args) {
    	Candy candy = new Candy();
    	candy.addCandies(2);
    	System.out.println(candy.getCost());
    }
    private void selectRoles(){}
    private void roles(String role){}
    private void addItems() {}
    private void addItemsOperation(int choice) {}
    private void placeOrder() {}
    private void placeOrderOperation(int choice) {}
}