package com.api.NormalizeService.routes;

import com.api.NormalizeService.processor.OnlineMessageProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NormalizeServiceRoute extends RouteBuilder {
    @Autowired
    OnlineMessageProcessor OnlineMessageProcessor;
    @Override
    public void configure() throws Exception {
        //queue input
        //transformation
        //database output
        from("activemq:online-queue")
                .routeId("online-queue")
                .process(OnlineMessageProcessor)
                .log("${body}")
                .to("activemq:queue:guarantee-event-queue");
    }
}
