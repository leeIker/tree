package huijingyuan.tree.model;

public class Order_Privilege {
	private int id_order;
	private String name;
	private int add_order;
	private int delete_order;
	private int modify_order;
	public int getId_order() {
		return id_order;
	}
	public void setId_order(int id_order) {
		this.id_order = id_order;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdd_order() {
		return add_order;
	}
	public void setAdd_order(int add_order) {
		this.add_order = add_order;
	}
	public int getDelete_order() {
		return delete_order;
	}
	public void setDelete_order(int delete_order) {
		this.delete_order = delete_order;
	}
	public int getModify_order() {
		return modify_order;
	}
	public void setModify_order(int modify_order) {
		this.modify_order = modify_order;
	}
	@Override
	public String toString() {
		return "Order_Privilege [id_order=" + id_order + ", name=" + name + ", add_order=" + add_order
				+ ", delete_order=" + delete_order + ", modify_order=" + modify_order + "]";
	}
	
}
