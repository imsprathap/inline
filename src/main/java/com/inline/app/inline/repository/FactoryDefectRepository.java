package com.inline.app.inline.repository;

import com.inline.app.inline.entity.FactoryDefect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactoryDefectRepository extends JpaRepository<FactoryDefect, Long> {
}
