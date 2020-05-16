package huijingyuan.tree.model;

import lombok.Data;


public class privilege_for_three {
	private int id_three;
	private String name;
	private boolean add_order;
	private boolean delete_order;
	private boolean modify_order;
	public int getId_three() {
		return id_three;
	}
	public void setId_three(int id_three) {
		this.id_three = id_three;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAdd_order() {
		return add_order;
	}
	public void setAdd_order(boolean add_order) {
		this.add_order = add_order;
	}
	public boolean isDelete_order() {
		return delete_order;
	}
	public void setDelete_order(boolean delete_order) {
		this.delete_order = delete_order;
	}
	public boolean isModify_order() {
		return modify_order;
	}
	public void setModify_order(boolean modify_order) {
		this.modify_order = modify_order;
	}
	
}
