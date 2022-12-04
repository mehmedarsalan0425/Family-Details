package edu.mehmed.family.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import edu.mehmed.family.constant.AppConstant;


@Entity
@Table(name=AppConstant.FAMILY_INFO)
public class FamilyEntity implements Serializable{

	@Id
	@GenericGenerator(name="info", strategy = "increment")
	@GeneratedValue(generator = "info")
	@Column(name="")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Column(name="age")
	private int age;
	@Column(name="address")
	private String address;
	@Column(name="profession")
	private String profession;
	@Column(name="contact_number")
	private String contactNumber;
	@Column(name="qualification")
	private String qualification;
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
		return "FamilyEntity [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", address="
				+ address + ", profession=" + profession + ", contactNumber=" + contactNumber + ", qualification="
				+ qualification + "]";
	}
	
	
	
	
}
