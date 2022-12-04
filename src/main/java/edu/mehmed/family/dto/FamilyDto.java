package edu.mehmed.family.dto;

import java.io.Serializable;

public class FamilyDto implements Serializable{

	private String name;
	private int age;
	private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	private String address;
	private String profession;
	private String contactNumber;
	private String qualification;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "FamilyDto [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", profession=" + profession + ", contactNumber=" + contactNumber + ", qualification=" + qualification
				+ "]";
	}
	
	
	
}
