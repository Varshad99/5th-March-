package accessmodifier;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifier ad =new AccessModifier();
		ad.test1(); //we can call this is default modifier from another class -->accessible within package
		ad.test2(); //we can call public modifier from another class --> accessible within project
		//ad.test3(); //we can't call private modifier from another class --> accessible within only same class
		ad.test4(); //we call protected modifier from another class --> accessible within package -->we can call another package using inheritance

		System.out.println(ad.a);
		System.out.println(ad.b);
		//System.out.println(ad.c); //because this modifier accesible within only same class
		System.out.println(ad.d);
		
	}

}
