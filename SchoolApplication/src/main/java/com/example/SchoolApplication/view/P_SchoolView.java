package com.example.SchoolApplication.view;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class P_SchoolView implements Serializable {
	private static final long serialVersionUID = 1L;
	private int RollNo;
	@Size(min = 2, message = "Name should contain atleast more than two characters")
	private String Stud_Name;
	@Size(min = 2, message = "father Name should contain atleast more than two characters")
	private String Father_Name;
	@Size(min = 2, message = "mother Name should contain atleast more than two characters")
	private String Mother_Name;
	@Past(message = "birth date can not be future")
	private LocalDate Birth_Date;
	@Positive(message = "class can not be negative")
	private int Standard;
	@Positive(message = "age can not be negative")
	private int age;
	private LocalDateTime Created_On;
	private LocalDateTime modified_On;
	private LocalDate Admission_date;
    private int fees;
	public P_SchoolView(int rollNo, String stud_Name, String father_Name, String mother_Name, LocalDate birth_Date,
			int standard, int age, LocalDateTime created_On, LocalDateTime modified_On, LocalDate admission_date, int fees) {
		super();
		RollNo = rollNo;
		Stud_Name = stud_Name;
		Father_Name = father_Name;
		Mother_Name = mother_Name;
		Birth_Date = birth_Date;
		Standard = standard;
		this.age = age;
		Created_On = created_On;
		this.modified_On = modified_On;
		Admission_date = admission_date;
		this.fees = fees;
	}

	public P_SchoolView() {

	}


	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getStud_Name() {
		return Stud_Name;
	}

	public void setStud_Name(String stud_Name) {
		Stud_Name = stud_Name;
	}

	public String getFather_Name() {
		return Father_Name;
	}

	public void setFather_Name(String father_Name) {
		Father_Name = father_Name;
	}

	public String getMother_Name() {
		return Mother_Name;
	}

	public void setMother_Name(String mother_Name) {
		Mother_Name = mother_Name;
	}

	public LocalDate getBirth_Date() {
		return Birth_Date;
	}

	public void setBirth_Date(LocalDate birth_Date) {
		Birth_Date = birth_Date;
	}

	public int getStandard() {
		return Standard;
	}

	public void setStandard(int standard) {
		Standard = standard;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDateTime getCreated_On() {
		return Created_On;
	}

	public void setCreated_On(LocalDateTime created_On) {
		Created_On = created_On;
	}

	public LocalDateTime getModified_On() {
		return modified_On;
	}

	public void setModified_On(LocalDateTime modified_On) {
		this.modified_On = modified_On;
	}

	public LocalDate getAdmission_date() {
		return Admission_date;
	}

	public void setAdmission_date(LocalDate admission_date) {
		Admission_date = admission_date;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "P_SchoolView [RollNo=" + RollNo + ", Stud_Name=" + Stud_Name + ", Father_Name=" + Father_Name
				+ ", Mother_Name=" + Mother_Name + ", Birth_Date=" + Birth_Date + ", Standard=" + Standard + ", age="
				+ age + ", Created_On=" + Created_On + ", modified_On=" + modified_On + ", Admission_date="
				+ Admission_date + "]";
	}
}
