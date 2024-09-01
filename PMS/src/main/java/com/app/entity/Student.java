package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String stuName;
	
	@ManyToOne
	@JoinColumn(name = "collegeId")
	private College collegeName;
	private Long rollNo;
	private String qualification;
	private int year;
	
	@OneToOne
	@JoinColumn(name="certificateId")
	private Certificate certificate;
	private Long hallTicketNo;

	private Student() {
	}

	public Student(String stuName, College collegeName, Long rollNo, String qualification, int year,
			Certificate certificate, Long hallTicketNo) {
		super();
		this.stuName = stuName;
		this.collegeName = collegeName;
		this.rollNo = rollNo;
		this.qualification = qualification;
		this.year = year;
		this.certificate = certificate;
		this.hallTicketNo = hallTicketNo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public College getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(College collegeName) {
		this.collegeName = collegeName;
	}

	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public Long getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(Long hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}

}
