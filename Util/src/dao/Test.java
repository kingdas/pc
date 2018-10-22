package dao;

public class Test {
	public static void main(String[] args) {
		Userdao userDao = new DaoImplement();
//		User u = new User("mike", 1);
//		int n = userDao.add(u);
//		System.out.println(n);
		User u = userDao.findById(1);
		System.out.println(u);
	}
}
