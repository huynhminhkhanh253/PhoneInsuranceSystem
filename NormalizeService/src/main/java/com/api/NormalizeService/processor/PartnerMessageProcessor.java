package com.api.NormalizeService.processor;

import com.api.NormalizeService.model.PartnerMessage.PartnerMessage;
import com.api.NormalizeService.service.ConvertService;
import com.api.NormalizeService.service.PartnerMessageService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.xml.XmlMapper;
import jakarta.xml.bind.JAXBContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import netscape.javascript.JSObject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.hibernate.type.format.jackson.JacksonXmlFormatMapper;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.DataInput;
import java.io.File;
import java.io.StringReader;

@Component
@Slf4j
@RequiredArgsConstructor
public class PartnerMessageProcessor implements Processor {
    private final ObjectMapper objectMapper;
    @Autowired
    PartnerMessageService partnerMessageService;
    @Autowired
    ConvertService convertService;
    @Override
    public void process(Exchange exchange) throws Exception {
        try {

            JAXBContext context = JAXBContext.newInstance(PartnerMessage.class);
            PartnerMessage partnerMessage = (PartnerMessage) context.createUnmarshaller().unmarshal(new StringReader(exchange.getIn().getBody().toString()));
            log.info("Received partner event {}", partnerMessage);
            partnerMessageService.savePartnerMessageToDb(partnerMessage);
            log.info("Converted {}",convertService.convertToGuaranteeEvent(partnerMessage));
            exchange.getIn().setBody(objectMapper.writeValueAsString(convertService.convertToGuaranteeEvent(partnerMessage)));
        } catch (Exception e) {
            log.error("",e);
        }
    }

}
