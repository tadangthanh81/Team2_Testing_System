package gdp5.team2.testingsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gdp5.team2.testingsys.enties.QuestionTag;
@Repository
public interface QuestionTagRepository extends JpaRepository<QuestionTag, Integer> {
	
}
