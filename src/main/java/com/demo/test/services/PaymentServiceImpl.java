package com.demo.test.services;

import com.demo.test.ipag.client.PaymentClient;
import com.demo.test.ipag.dto.PaymentDto;
import com.demo.test.ipag.response.dto.PayResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentClient paymentClient;

    @Override
    public PayResponseDto pay(PaymentDto payment) {
        return paymentClient.pay(payment);
    }

    @Override
    public PayResponseDto search(String id, String uuid, String tid, String orderId) {
        return paymentClient.search(id, uuid, tid, orderId);
    }
}
