package huijingyuan.tree.dto;

public class BasePrivilegeDto {
	private int id;
	private String name;
	private Boolean value;
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
	public Boolean getValue() {
		return value;
	}
	public void setValue(Boolean value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "BasePrivilegeDto [id=" + id + ", name=" + name + ", value=" + value + "]";
	}
	
}
