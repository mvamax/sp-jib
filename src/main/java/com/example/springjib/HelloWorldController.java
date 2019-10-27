package com.example.springjib;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;  
import java.net.UnknownHostException;  
@RestController
public class HelloWorldController {


    @GetMapping("/")
    public String sayHello() {
        try {  
            InetAddress id = InetAddress.getLocalHost();  
            return "Hello, World v2 on "+id.getHostName();
          } catch (UnknownHostException e) {  
            return "Hello, World on undefined";
          }  
    }

}
