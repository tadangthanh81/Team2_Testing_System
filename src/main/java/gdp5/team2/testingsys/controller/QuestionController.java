package gdp5.team2.testingsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gdp5.team2.testingsys.enties.Question;
import gdp5.team2.testingsys.service.QuestionService;

@RestController
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@RequestMapping(value = "question/all", method = RequestMethod.GET)
	private List<Question> getAllQuestion() {
		return questionService.getAllQuestion();
	}
	
	@RequestMapping(value = "question/{id}", method = RequestMethod.GET)
	public Question getQById(@PathVariable("id") String id) {
		return questionService.findById(id);
	}
	
	@RequestMapping(value = "question/search-by-content/{contentSearch}", method = RequestMethod.GET)
	private List<Question> searchByContent(@PathVariable("contentSearch") String contentSearch) {
		return questionService.searchByContent(contentSearch); 

	}
	
	@RequestMapping(value = "question/add", method = RequestMethod.POST)
	public void insert(@RequestBody Question question) {
		questionService.insertQuestion(question);
	}
	
	@RequestMapping(value = "question/delete/{questionID}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("questionID") String questionID) {
		 questionService.deletebyId(questionID);
	}
	
	@PutMapping("/question/edit/{questionID}")
	private String editQuestion(@PathVariable("questionID") String questionID, @RequestBody Question newQuestion) {
		return questionService.editQuestion(questionID, newQuestion);

	}
}
