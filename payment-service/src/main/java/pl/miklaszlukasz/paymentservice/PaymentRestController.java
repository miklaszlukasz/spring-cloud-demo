package pl.miklaszlukasz.paymentservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentRestController {

    @Value("${eureka.instance.instance-id}")
    private String value;

    @GetMapping
    public String hello() {
        return "hello payment service: " + value;
    }
}
