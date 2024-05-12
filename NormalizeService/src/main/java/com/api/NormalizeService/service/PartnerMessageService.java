package com.api.NormalizeService.service;

import com.api.NormalizeService.model.PartnerMessage.PartnerMessage;
import com.api.NormalizeService.repository.PartnerMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PartnerMessageService {
    @Autowired
    PartnerMessageRepository partnerMessageRepository;
    public void savePartnerMessageToDb(PartnerMessage partnerMessage){
        partnerMessageRepository.save(partnerMessage);
    }
}
