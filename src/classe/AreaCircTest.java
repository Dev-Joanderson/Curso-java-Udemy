package classe;

public class AreaCircTest {
	public static void main(String []args) {
		
		AreaCirc p1 = new AreaCirc(10);
		p1.raio = 10;
		
		System.out.println(p1.area());
		
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);		
		System.out.println(Math.PI);
	}

}
