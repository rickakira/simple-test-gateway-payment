package com.demo.test.ipag.client;

import com.demo.test.client.config.ClientConfiguration;
import com.demo.test.ipag.dto.PaymentDto;
import com.demo.test.ipag.response.dto.PayResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "payment-client", url = "${ipag.url}", configuration = ClientConfiguration.class)
public interface PaymentClient {


    @PostMapping(value = "/pay", produces = "application/json")
    PayResponseDto pay(@RequestBody PaymentDto parameters);

    @GetMapping("/service/consult")
    PayResponseDto search(@RequestParam(name = "id") String id,
                          @RequestParam(name = "uuid") String uuid,
                          @RequestParam(name = "tid") String tid,
                          @RequestParam(name = "order_id") String order_id);

}
