package com.api.NormalizeService.processor;

import com.api.NormalizeService.model.OnlineMessage.OnlineMessage;
import com.api.NormalizeService.service.ConvertService;
import com.api.NormalizeService.service.OnlineMessageService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class OnlineMessageProcessor implements Processor {
    private final ObjectMapper objectMapper;
    @Autowired
    OnlineMessageService onlineMessageService;
    @Autowired
    ConvertService convertService;
    @Override
    public void process(Exchange exchange) throws Exception {
        try {
            OnlineMessage onlineMessage = objectMapper.readValue(exchange.getIn().getBody().toString(), OnlineMessage.class);
            log.info("Received online event {}", onlineMessage);
            onlineMessageService.saveOnlineMessageToDb(onlineMessage);
            log.info("Converted {}",convertService.convertToGuaranteeEvent(onlineMessage));
            exchange.getIn().setBody(objectMapper.writeValueAsString(convertService.convertToGuaranteeEvent(onlineMessage)));
        } catch (Exception e) {
            log.error("",e);
        }
    }

}
