package com.esi.hrservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esi.hrservice.model.PhDApplication;

public interface HRRepository extends JpaRepository<PhDApplication, String> {
}
