package com.api.NormalizeService.repository;

import com.api.NormalizeService.model.PartnerMessage.PartnerMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerMessageRepository extends JpaRepository<PartnerMessage, Long> {
}
