package gdp5.team2.testingsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gdp5.team2.testingsys.enties.QuestionLevel;
@Repository
public interface QuestionLevelRepository extends JpaRepository<QuestionLevel, Integer> {

}
