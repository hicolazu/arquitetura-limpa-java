package com.lazuroz.cleanarch.data.client.response;

import lombok.Data;

@Data
public class AddressResponse {
    private String street;
    private String city;
    private String state;
}
