package com.demo.test.controller;

import com.demo.test.ipag.dto.PaymentDto;
import com.demo.test.ipag.response.dto.PayResponseDto;
import com.demo.test.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/payments")
@RequiredArgsConstructor
@Validated
public class PaymentController {

    private final PaymentService service;

    @PostMapping("/")
    public PayResponseDto pay(@RequestBody PaymentDto payment) {
        return service.pay(payment);
    }

    @GetMapping("/")
    public PayResponseDto search(@RequestParam String id,
                                 @RequestParam String uuid,
                                 @RequestParam String tid,
                                 @RequestParam String order_id) {
        return service.search(id, uuid, tid, order_id);
    }

}
