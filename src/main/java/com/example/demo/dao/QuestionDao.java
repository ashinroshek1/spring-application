package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

	List<Question> findBylanguage(String language);

}
