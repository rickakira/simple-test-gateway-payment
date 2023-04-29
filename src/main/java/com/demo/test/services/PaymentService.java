package com.demo.test.services;

import com.demo.test.ipag.dto.PaymentDto;
import com.demo.test.ipag.response.dto.PayResponseDto;

public interface PaymentService {

    PayResponseDto pay(PaymentDto payment);

    PayResponseDto search(String id, String uuid, String tid, String order_id);

}
