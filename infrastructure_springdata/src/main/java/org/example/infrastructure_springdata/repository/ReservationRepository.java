package org.example.infrastructure_springdata.repository;

import org.example.infrastructure_springdata.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {
}