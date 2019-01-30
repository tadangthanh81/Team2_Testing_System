package com.lhlinh.app.enties;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="category", schema = "testing_system")
public class QuestionCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id", nullable = false)
	private  int id;
	
	@Column(name = "category_name")
	private  String categoryName;

	@Column(name = "date_created")
	private  Date date_created;
	
	@Column(name = "status")
	private  int status;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "questionCategory")
	private List<Question> questions = new ArrayList<>();
	
	@ManyToOne(cascade=CascadeType.DETACH,fetch=FetchType.EAGER)
	@JoinColumn(name = "user_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
	Users userCategory;

	public QuestionCategory(int id, String categoryName, Date date_created, int status,
			List<Question> questions, Users userCategory) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.date_created = date_created;
		this.status = status;
		this.questions = questions;
		this.userCategory = userCategory;
	}

	public QuestionCategory() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Users getUserCategory() {
		return userCategory;
	}

	public void setUserCategory(Users userCategory) {
		this.userCategory = userCategory;
	}
	
}
