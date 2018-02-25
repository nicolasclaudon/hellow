package com.capgemini.pf.hellow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
import java.net.InetAddress;
import java.net.UnknownHostException;
 
@RestController
public final class HelloController {
 
    @GetMapping
    public final String hola() throws UnknownHostException {
        return "Hello World on " + InetAddress.getLocalHost().getHostAddress();
    }
}
