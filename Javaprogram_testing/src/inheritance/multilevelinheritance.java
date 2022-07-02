package inheritance;

public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mother m = new Mother();
		m.jwellary();
		m.saree();
		
		Daugther d = new Daugther();
		d.dress();
		d.bangles();
		d.earrings();
		
		GrandDaugther gd = new GrandDaugther();
		gd.cuteness();
		gd.smile();
		
		
	}

}
