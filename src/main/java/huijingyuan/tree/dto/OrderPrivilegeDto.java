package huijingyuan.tree.dto;

import java.util.ArrayList;

public class OrderPrivilegeDto {
	private int id;
	private String name;
	private ArrayList<BasePrivilegeDto> children;
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
	public ArrayList<BasePrivilegeDto> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<BasePrivilegeDto> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "OrderPrivilegeDto [id=" + id + ", name=" + name + ", children=" + children + "]";
	}
	
}
