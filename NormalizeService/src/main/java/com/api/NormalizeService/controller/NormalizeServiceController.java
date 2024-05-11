package com.api.NormalizeService.controller;

import com.api.NormalizeService.model.OnlineMessages.OnlineMessage;
import com.api.NormalizeService.service.OnlineMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("normalizeService")
public class NormalizeServiceController {

    // Controller for testing return data format
    @Autowired
    OnlineMessageService onlineMessageService;
    @PostMapping("/add")
    public OnlineMessage save(@RequestBody OnlineMessage onlineMessage){
        return onlineMessageService.addToDb(onlineMessage);
    }
}
