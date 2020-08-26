package com.example.demo;

public class UserRegistration {
	
	private String eNo;
	private String eName;
	private String eEmail;
	public String geteNo() {
		return eNo;
	}
	public void seteNo(String eNo) {
		this.eNo = eNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	@Override
	public String toString() {
		return "UserRegistration [eNo=" + eNo + ", eName=" + eName + ", eEmail=" + eEmail + "]";
	}
	
	

}
