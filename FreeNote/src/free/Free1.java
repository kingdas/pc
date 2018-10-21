package free;

//up to change type
class Fa {
	public static void draw(Fa p) {
		System.out.println("use the father's way of drawing ");
	}
}

public class Free1 extends Fa {
	public static void main(String[] args) {
		Fa q = new Free1();
		draw(q);
		Free1 r = (Free1) q;
		System.out.println(r);
	}
}
