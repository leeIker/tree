package huijingyuan.tree.model;

public class base_privilege {
	private int id_basc;
	private String name;
	private boolean value;
	public int getId_basc() {
		return id_basc;
	}
	public void setId_basc(int id_basc) {
		this.id_basc = id_basc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isValue() {
		return value;
	}
	public void setValue(boolean value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "base_privilege [id_basc=" + id_basc + ", name=" + name + ", value=" + value + "]";
	}
	
}

