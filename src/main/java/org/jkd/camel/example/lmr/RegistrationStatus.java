package org.jkd.camel.example.lmr;

public class RegistrationStatus {

	private String membershipId;
	
	private String status;
	
	private String faliureReason;

	public String getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFaliureReason() {
		return faliureReason;
	}

	public void setFaliureReason(String faliureReason) {
		this.faliureReason = faliureReason;
	}
}
