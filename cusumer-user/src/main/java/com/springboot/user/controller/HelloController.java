package com.springboot.user.controller;

import com.springboot.user.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference(version = "${demo.service.version}",group = "f")
    TicketService ticketService;

    @GetMapping(value = "hello")
    public String hello(){
        return ticketService.getTicket();
    }
}
