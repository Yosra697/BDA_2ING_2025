package com.supgalilee.h2demo1.repository;

import com.supgalilee.h2demo1.entities.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdherentRepository extends JpaRepository<Adherent, Long> {

}
