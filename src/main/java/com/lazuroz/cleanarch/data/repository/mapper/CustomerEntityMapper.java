package com.lazuroz.cleanarch.data.repository.mapper;

import com.lazuroz.cleanarch.core.domain.Customer;
import com.lazuroz.cleanarch.data.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toEntity(Customer customer);
}
