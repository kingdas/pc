package free;

//the method of instanceOf
class Quadrangle {
	// do something
}

class Square extends Quadrangle {
	// do something
}

class Anything {

}

public class Free2 extends Quadrangle {
	public static void main(String[] args) {
		Quadrangle q = new Quadrangle();
		if (q instanceof Free2) {
			Free2 f = (Free2) q;
		}
		if (q instanceof Square) {
			Square s = (Square) q;
		}
        // System.out.println(q instanceof Anything);
		// only one kind of class inherit the father class ,
		// it is possible to be true when using the keyword instanceof
		// for this one it has syntax error owing to the class Anything doesn't inherit
		// the father class Quadrangle
	}

}
