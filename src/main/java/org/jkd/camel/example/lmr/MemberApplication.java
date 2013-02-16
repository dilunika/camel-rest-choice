package org.jkd.camel.example.lmr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberApplication", propOrder = {
    "name",
    "organization",
    "nic",
    "employeeId"
})
@XmlRootElement
public class MemberApplication {
	
	@XmlElement
	private String name;
	
	@XmlElement
	private String organization;
	
	@XmlElement
	private String nic;
	
	@XmlElement
	private String employeeId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "MemberApplication [name=" + name + ", organization="
				+ organization + ", nic=" + nic + ", employeeId=" + employeeId
				+ "]";
	}

}
