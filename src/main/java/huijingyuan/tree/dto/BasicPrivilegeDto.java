package huijingyuan.tree.dto;

public class BasicPrivilegeDto {
	private int id;
	private String name;
	private boolean value;
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
	public boolean isValue() {
		return value;
	}
	public void setValue(boolean value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "BasicPrivilegeDto [id=" + id + ", name=" + name + ", value=" + value + "]";
	}
	
}
