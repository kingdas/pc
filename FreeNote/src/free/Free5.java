package free;

//abstract type and interface
interface drawTest {
	public void darw();
}

public class Free5 {
	public void way() {
		System.out.println("���෽��");
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
//                              ͬ������д�ӿڷ��� Ϊʲô��д���� 
//	}
	@Override
	public void darw() {
		// TODO Auto-generated method stub
		System.out.println("freeaʵ�ֽӿ�"); // �˴���д�ӿڷ����Ǳ����ϵͳ����
	}
}

class Freeb extends Free5 implements drawTest {

	public void darw() {
		System.out.println("Freebʵ�ֽӿ�");
	}

}
