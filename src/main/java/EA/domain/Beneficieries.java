package EA.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Beneficieries {

	private String name;

	@Override
	public String toString() {
		return "Beneficieries [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
