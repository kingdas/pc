package dao;

public class User {
	private int id;
	private String name;
	private int groupid;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", groupid=" + groupid + "]";
	}

	public User(int id, String name, int groupid) {
		super();
		this.id = id;
		this.name = name;
		this.groupid = groupid;
	}

	public User(String name, int groupid) {
		super();
		this.name = name;
		this.groupid = groupid;
	}

	public User() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroupid() {
		return groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

}
