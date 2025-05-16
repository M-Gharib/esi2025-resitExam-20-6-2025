package com.esi.phdservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esi.phdservice.model.PhDApplication;

public interface PhDApplicationRepository extends JpaRepository<PhDApplication, String> {
}
