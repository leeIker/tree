package huijingyuan.tree.model;

public class TreeRole {
	private int id;
	private String name;
	private int id_order;
	private int id_name;
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
	public int getId_order() {
		return id_order;
	}
	public void setId_order(int id_order) {
		this.id_order = id_order;
	}
	public int getId_name() {
		return id_name;
	}
	public void setId_name(int id_name) {
		this.id_name = id_name;
	}
	@Override
	public String toString() {
		return "TreeRole [id=" + id + ", name=" + name + ", id_order=" + id_order + ", id_name=" + id_name + "]";
	}
	
}
