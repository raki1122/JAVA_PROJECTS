package com.example.SchoolApplication.view;

import java.time.LocalDate;
import java.time.LocalTime;

public class P_SchoolView {
	private int RollNo;
	private String Stud_Name;
	private String Father_Name;
	private String Mother_Name;
	private LocalDate Birth_Date;
	private int Standard;
	private int age;
	private LocalTime Created_On;
	private LocalTime modified_On;
	private LocalDate Admission_date;

	public P_SchoolView() {

	}

	public P_SchoolView(int rollNo, String stud_Name, String father_Name, String mother_Name, LocalDate birth_Date,
			int standard, int age, LocalTime created_On, LocalTime modified_On, LocalDate admission_date) {
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

	public LocalTime getCreated_On() {
		return Created_On;
	}

	public void setCreated_On(LocalTime created_On) {
		Created_On = created_On;
	}

	public LocalTime getModified_On() {
		return modified_On;
	}

	public void setModified_On(LocalTime modified_On) {
		this.modified_On = modified_On;
	}

	public LocalDate getAdmission_date() {
		return Admission_date;
	}

	public void setAdmission_date(LocalDate admission_date) {
		Admission_date = admission_date;
	}

	@Override
	public String toString() {
		return "P_SchoolView [RollNo=" + RollNo + ", Stud_Name=" + Stud_Name + ", Father_Name=" + Father_Name
				+ ", Mother_Name=" + Mother_Name + ", Birth_Date=" + Birth_Date + ", Standard=" + Standard + ", age="
				+ age + ", Created_On=" + Created_On + ", modified_On=" + modified_On + ", Admission_date="
				+ Admission_date + "]";
	}
}
