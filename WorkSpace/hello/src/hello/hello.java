package hello;

class point{
	int x;
	int y;
	
	public point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
}
class triangle{
	point pointA;
	point pointB;
	point pointC;
	
	 
	public triangle(point pointA, point pointB, point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}


	public point getPointA() {
		return pointA;
	}


	public point getPointB() {
		return pointB;
	}


	public point getPointC() {
		return pointC;
	}


	public void display() {
		System.out.println(getPointA().getX());
	}
}

public class hello {

	public static void main(String[] args)throws Exception {
		point aPoint= new point(12,12);
		triangle triangle =new triangle(aPoint, aPoint, aPoint);
		
		triangle.display();
		
		
	}

}



