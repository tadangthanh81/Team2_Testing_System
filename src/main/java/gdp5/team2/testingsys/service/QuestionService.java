package gdp5.team2.testingsys.service;

import java.util.List;

import org.hibernate.validator.constraints.ISBN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import gdp5.team2.testingsys.enties.Question;
import gdp5.team2.testingsys.repository.QuestionRepository;


@Service
public class QuestionService {
	@Autowired
	QuestionRepository questionRepository;
	
	//get all
	public List<Question> getAllQuestion() {
		return questionRepository.findAll();
	}
	
	//find one
	public Question findById(String id) {
		return questionRepository.findById(id).get();
		
	}
	
	//save question
	
	public void insertQuestion(Question question) {
		questionRepository.saveAndFlush(question);
	}
	
	//delete by id
	
	public void deletebyId(String id) {
		questionRepository.deleteById(id);
		
	}
	
	//edit service
	public String editQuestion(String id, Question newQuestion) {
		Boolean existQ = questionRepository.existsById(id);
		if(!existQ) {
			return "No question with id above";
		} else {
			questionRepository.saveAndFlush(newQuestion);
			return "Update success";
		}
	}
	
	//search by content
	public List<Question> searchByContent( String contentSearch) {
//		List<Question> exist = questionRepository.findQuestionByContent(contentSearch);
//		if(exist != null) {
//			return exist;
//		}
//		return null;
		return questionRepository.findByContentContaining(contentSearch);
	}
}
