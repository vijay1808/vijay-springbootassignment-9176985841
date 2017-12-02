package org.springboot.sampleproject.create.Request;

public class CreateReq {

	private String id;
	private String fName;
	private String lName;
	private String email;
	private long pinCode;
	private String birthDate;
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "CreateReq [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", pinCode="
				+ pinCode + ", birthDate=" + birthDate + ", isActive=" + isActive + "]";
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	private boolean isActive;
}
