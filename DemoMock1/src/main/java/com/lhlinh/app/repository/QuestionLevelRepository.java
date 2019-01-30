package com.lhlinh.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lhlinh.app.enties.QuestionLevel;
@Repository
public interface QuestionLevelRepository extends JpaRepository<QuestionLevel, Integer> {

}
