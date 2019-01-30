package com.lhlinh.app.enties;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users", schema = "testing_system")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id", nullable = false)
	private  int id;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "status")
	private int status;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "userQuestion")
	private List<Question> userQ = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "userCategory")
	private List<QuestionCategory> userC = new ArrayList<>();

	public Users(int id, String fullName, String email, String password, int status, List<Question> userQ,
			List<QuestionCategory> userC) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.status = status;
		this.userQ = userQ;
		this.userC = userC;
	}

	public Users() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<Question> getUserQ() {
		return userQ;
	}

	public void setUserQ(List<Question> userQ) {
		this.userQ = userQ;
	}

	public List<QuestionCategory> getUserC() {
		return userC;
	}

	public void setUserC(List<QuestionCategory> userC) {
		this.userC = userC;
	}
	
	
	

}
