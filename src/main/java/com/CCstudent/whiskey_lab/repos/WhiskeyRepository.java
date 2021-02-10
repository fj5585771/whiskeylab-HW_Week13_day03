package com.CCstudent.whiskey_lab.repos;

import com.CCstudent.whiskey_lab.models.Whiskey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WhiskeyRepository extends JpaRepository<Whiskey, Long> {
    List<Whiskey> findByAgeLesserThan(int age);
}
