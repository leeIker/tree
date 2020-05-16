package huijingyuan.tree.model;

import lombok.Data;

public class Role {
	private int id;
	private String name;
	private int id_two;
	private int id_Three;
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
	public int getId_two() {
		return id_two;
	}
	public void setId_two(int id_two) {
		this.id_two = id_two;
	}
	public int getId_Three() {
		return id_Three;
	}
	public void setId_Three(int id_Three) {
		this.id_Three = id_Three;
	}
	
}
