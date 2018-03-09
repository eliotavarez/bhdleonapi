package bhdleon.dashboard.models;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Executive {
	@NotNull
	private String name;
	@NotNull
	private String lastName;

	public Executive() {
	}

	public Executive(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
