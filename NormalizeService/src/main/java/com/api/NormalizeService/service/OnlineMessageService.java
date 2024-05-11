package com.api.NormalizeService.service;

import com.api.NormalizeService.model.OnlineMessages.OnlineMessage;
import com.api.NormalizeService.repository.OnlineMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OnlineMessageService {
    @Autowired
    OnlineMessageRepository onlineMessageRepository;
    //Check data format
    public OnlineMessage addToDb(OnlineMessage onlineMessage){
        return onlineMessageRepository.save(onlineMessage);
    }
    public void saveOnlineMessageToDb(OnlineMessage onlineMessage){
        onlineMessageRepository.save(onlineMessage);
    }

}
