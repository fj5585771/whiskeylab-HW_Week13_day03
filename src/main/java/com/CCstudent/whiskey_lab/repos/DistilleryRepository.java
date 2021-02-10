package com.CCstudent.whiskey_lab.repos;

import com.CCstudent.whiskey_lab.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistilleryRepository extends JpaRepository<Distillery, Long> {

}
