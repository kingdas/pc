package dao;

import java.util.List;

public class DaoImplement implements Userdao {

	@Override
	public int add(User u) {
		// TODO Auto-generated method stub
		String sql = "insert into user1 (name,groupid)values('" + u.getName() + "'," + u.getGroupid() + ");";
		return DbUtils.executeCUD(sql);
	}

	@Override
	public int update(User u) {
		String sql = "update user1 set name = " + u.getName() + ",groupid = " + u.getGroupid() + " where id = "
				+ u.getId() + ";";
		return DbUtils.executeCUD(sql);

	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from user1 where id = " + id + ";";
		return DbUtils.executeCUD(sql);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from user1 where id = " + id + ";";
		List<User> li = DbUtils.executeR(sql, User.class);
		if (li.size() > 0) {
			return li.get(0);
		}
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from user1 ";
		return DbUtils.executeR(sql, User.class);
	}

}
