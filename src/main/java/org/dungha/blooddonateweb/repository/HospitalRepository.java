package org.dungha.blooddonateweb.repository;

import org.dungha.blooddonateweb.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
    Optional<Hospital> findByUserId(Long userId);
    Optional<Hospital> findById(int id);
}