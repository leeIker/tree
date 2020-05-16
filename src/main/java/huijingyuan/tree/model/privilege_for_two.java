package huijingyuan.tree.model;

import lombok.Data;

public class privilege_for_two {
	
	private int id_two;
	private String name;
	private boolean add_name;
	private boolean delete_name;
	private boolean modify_name;
	public int getId_two() {
		return id_two;
	}
	public void setId_two(int id_two) {
		this.id_two = id_two;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAdd_name() {
		return add_name;
	}
	public void setAdd_name(boolean add_name) {
		this.add_name = add_name;
	}
	public boolean isDelete_name() {
		return delete_name;
	}
	public void setDelete_name(boolean delete_name) {
		this.delete_name = delete_name;
	}
	public boolean isModify_name() {
		return modify_name;
	}
	public void setModify_name(boolean modify_name) {
		this.modify_name = modify_name;
	}
	@Override
	public String toString() {
		return "privilege_for_two [id_two=" + id_two + ", name=" + name + ", add_name=" + add_name + ", delete_name="
				+ delete_name + ", modify_name=" + modify_name + "]";
	}
	
}
