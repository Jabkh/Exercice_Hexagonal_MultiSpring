package org.example.infrastructure_springdata.repository;

import org.example.infrastructure_springdata.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
}