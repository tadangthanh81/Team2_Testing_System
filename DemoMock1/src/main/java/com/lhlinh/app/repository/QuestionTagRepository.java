package com.lhlinh.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lhlinh.app.enties.QuestionTag;
@Repository
public interface QuestionTagRepository extends JpaRepository<QuestionTag, Integer> {
	
}
