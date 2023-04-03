package com.lazuroz.cleanarch.data;

import com.lazuroz.cleanarch.core.data.FindAddressByZipCode;
import com.lazuroz.cleanarch.core.domain.Address;
import com.lazuroz.cleanarch.data.client.FindAddressByZipCodeClient;
import com.lazuroz.cleanarch.data.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
