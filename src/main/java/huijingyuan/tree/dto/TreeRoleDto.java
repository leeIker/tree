package huijingyuan.tree.dto;

import java.util.ArrayList;

public class TreeRoleDto {
	private int id;
	private String name;
	private ArrayList children;
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
	public ArrayList getChildren() {
		return children;
	}
	public void setChildren(ArrayList children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "TreeRoleDto [id=" + id + ", name=" + name + ", children=" + children + "]";
	}
	
}
