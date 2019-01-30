package gdp5.team2.testingsys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import gdp5.team2.testingsys.enties.Question;
@Repository
public interface QuestionRepository extends JpaRepository<Question, String> {
	// search by content
//	@Query( value = "SELECT q FROM question q WHERE q.content = :content ", nativeQuery = true)
//	List<Question> findQuestionByContent(
//			 @Param("content") String content
//			);
	List<Question>  findByContentContaining(String contentSearch);
}
