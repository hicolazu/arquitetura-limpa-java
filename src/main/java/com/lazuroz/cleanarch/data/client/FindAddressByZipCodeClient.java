package com.lazuroz.cleanarch.data.client;

import com.lazuroz.cleanarch.data.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FindAddressByZipCodeClient", url = "${client.address.url}")
public interface FindAddressByZipCodeClient {

    @GetMapping(value = "/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") final String zipCode);
}
