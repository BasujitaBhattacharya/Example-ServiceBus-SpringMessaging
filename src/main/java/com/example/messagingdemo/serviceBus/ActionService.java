package com.example.messagingdemo.serviceBus;

import com.example.messagingdemo.MenuOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

// A simulation for a service that is performing an action after the message Is recieved
@Slf4j
@Service
public class ActionService {

    @Value("${app.throwErr:false}")
    boolean throwErr;

    public void performAction(MenuOrder menuOrder) {
        log.info("**** Performing Action With The recieved Msg {} ***", menuOrder.toString());
        if (throwErr) {
            throw new NullPointerException();
        }
    }
}
