package com.springboot.ticket.service;


import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0",group = "f")
@org.springframework.stereotype.Service
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "《发牛？》";
    }
}
