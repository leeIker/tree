package huijingyuan.tree.dto;

import huijingyuan.tree.model.privilege_for_three;
import huijingyuan.tree.model.privilege_for_two;

public class TreeDto {
	private int id;
	private String name;
	private privilege_for_two id_two;
	private privilege_for_three id_Three;
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
	public privilege_for_two getId_two() {
		return id_two;
	}
	public void setId_two(privilege_for_two id_two) {
		this.id_two = id_two;
	}
	public privilege_for_three getId_Three() {
		return id_Three;
	}
	public void setId_Three(privilege_for_three id_Three) {
		this.id_Three = id_Three;
	}
	
}
