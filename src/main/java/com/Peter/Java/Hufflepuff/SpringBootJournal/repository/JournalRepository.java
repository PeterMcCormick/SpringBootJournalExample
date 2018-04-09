package com.Peter.Java.Hufflepuff.SpringBootJournal.repository;

import com.Peter.Java.Hufflepuff.SpringBootJournal.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JournalRepository extends JpaRepository<Journal, Long> {  }