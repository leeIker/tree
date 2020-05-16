package huijingyuan.tree.model;

public class Name_Privilege {
	private int id_name;
	private String name;
	private int add_name;
	private int delete_name;
	private int modify_name;
	public int getId_name() {
		return id_name;
	}
	public void setId_name(int id_name) {
		this.id_name = id_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdd_name() {
		return add_name;
	}
	public void setAdd_name(int add_name) {
		this.add_name = add_name;
	}
	public int getDelete_name() {
		return delete_name;
	}
	public void setDelete_name(int delete_name) {
		this.delete_name = delete_name;
	}
	public int getModify_name() {
		return modify_name;
	}
	public void setModify_name(int modify_name) {
		this.modify_name = modify_name;
	}
	@Override
	public String toString() {
		return "Name_Privilege [id_name=" + id_name + ", name=" + name + ", add_name=" + add_name + ", delete_name="
				+ delete_name + ", modify_name=" + modify_name + "]";
	}
	
}
