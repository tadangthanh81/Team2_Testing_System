package gdp5.team2.testingsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gdp5.team2.testingsys.enties.QuestionCategory;
@Repository
public interface QuestionCategoryRepository extends JpaRepository<QuestionCategory, String>{

}
