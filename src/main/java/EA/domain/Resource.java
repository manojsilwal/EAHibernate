package EA.domain;

public class Resource {
	@Override
	public String toString() {
		return "Resource [type=" + type + ", name=" + name + "]";
	}
	private String type;
	private String name;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
