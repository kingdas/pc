package free;

//abstract type and interface
interface drawTest {
	public void darw();
}

public class Free5 {
	public void way() {
		System.out.println("父类方法");
	}

	public static void main(String[] args) {
		drawTest[] d = { new Freea(), new Freeb() };
		for (int i = 0; i < d.length; i++) {
			d[i].darw();
		}
	}
}

class Freea extends Free5 implements drawTest {

//	public void draw() {
//                              同样是重写接口方法 为什么手写不行 
//	}
	@Override
	public void darw() {
		// TODO Auto-generated method stub
		System.out.println("freea实现接口"); // 此处重写接口方法是报错后系统导入
	}
}

class Freeb extends Free5 implements drawTest {

	public void darw() {
		System.out.println("Freeb实现接口");
	}

}
