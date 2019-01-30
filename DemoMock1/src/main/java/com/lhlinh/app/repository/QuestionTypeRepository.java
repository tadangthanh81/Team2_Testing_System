package com.lhlinh.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lhlinh.app.enties.QuestionType;
@Repository
public interface QuestionTypeRepository  extends JpaRepository<QuestionType, Integer>{

}
