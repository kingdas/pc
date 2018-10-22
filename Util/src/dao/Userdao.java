package dao;

import java.util.List;

public interface Userdao {
	int add(User u);

	int update(User u);

	int delete(int id);

	User findById(int id);

	List<User> findAll();
}
