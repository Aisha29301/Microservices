package com.aishwarya.cloudgateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @RequestMapping("/orderServiceFallback")
    public String orderServiceFallback() {
        return "Order Service is taking too long to respond or is down. Please try again later";
    }

    @RequestMapping("/paymentServiceFallback")
    public String paymentServiceFallback() {
        return "Payment Service is taking too long to respond or is down. Please try again later";
    }
}
