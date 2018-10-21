package free;


public class Free6 {
	public Free6() {

	}

	public Free6(int id) {
		this.init();
		this.id = id;
	}

	public Free6(int id, String name) {
		
		this(id);
		this.name = name;

	}

	void init() {
		id = 1;
		name = "..";
	}

	int id;
	String name;

	public static void main(String[] args) {
		Free6 f = new Free6(2,"...");
		System.out.println(f.id);
		System.out.println(f.name);
	}
}
