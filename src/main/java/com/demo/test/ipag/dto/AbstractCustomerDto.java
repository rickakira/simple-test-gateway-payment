package com.demo.test.ipag.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractCustomerDto {

    private String name;
    private String cpf_cnpj;
    private String email;
    private String phone;

    @Getter
    @Setter
    @JsonRootName("billing_address")
    public static class BillingAddressDto {

        private String street;
        private String number;
        private String district;
        private String complement;
        private String city;
        private String state;
        private String zipcode;
    }

    @Getter
    @Setter
    @JsonRootName("shipping_address")
    static class ShippingAddressDto extends BillingAddressDto {

    }
}
