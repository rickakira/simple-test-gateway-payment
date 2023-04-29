package com.demo.test.ipag.response.dto;


import com.demo.test.ipag.dto.AbstractCustomerDto;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonRootName("customer")
public class CustomerDto extends AbstractCustomerDto {

    public CustomerDto() {
        super();
    }
}
