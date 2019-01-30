package gdp5.team2.testingsys.enties;

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
@Table(name="question_type", schema = "testing_system")
public class QuestionType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "type_id", nullable = false)
	private int id;
	
	@Column(name = "type_name")
	private String typeName;
	
	@Column(name = "status")
	private int status;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "questionType")
	private List<Question> questions = new ArrayList<>();

	public QuestionType(int id, String typeName, int status, List<Question> questions) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.status = status;
		this.questions = questions;
	}

	public QuestionType() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
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
	
	
	
	
}
