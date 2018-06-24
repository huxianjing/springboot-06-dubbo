package com.lyq.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyq.ticket.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void hello(){
     /*   String ticket = ticketService.getTicket();
        System.out.println("买到："+ticket);
        System.out.println("hot_fix...");*/

    }

}
