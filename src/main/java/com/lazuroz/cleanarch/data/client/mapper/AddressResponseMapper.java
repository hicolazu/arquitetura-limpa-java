package com.lazuroz.cleanarch.data.client.mapper;

import com.lazuroz.cleanarch.core.domain.Address;
import com.lazuroz.cleanarch.data.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
