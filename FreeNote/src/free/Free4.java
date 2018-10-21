package free;

//多态
public class Free4 {
	private Free4 arr[] = new Free4[6];
	private int index = 0;

	public void judge(Free4 q) {
		if (index < arr.length) {
			arr[index] = q;
			System.out.println(index);
			index++;
		}
	}

	public static void main(String[] args) {
		Free4 s = new Free4();
		s.judge(new Square1());// 这一条跟书上的一样怎么会报错
		s.judge(new Parallelogram());
	}
}

class Square1 extends Free4 {
	public Square1() {
		System.out.println("Square");
	}
}

class Parallelogram extends Free4 {
	public Parallelogram() {
		System.out.println("Parallelogram");
	}
}
