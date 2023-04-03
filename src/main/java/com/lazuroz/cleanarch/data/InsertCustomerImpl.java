package com.lazuroz.cleanarch.data;

import com.lazuroz.cleanarch.core.data.InsertCustomer;
import com.lazuroz.cleanarch.core.domain.Customer;
import com.lazuroz.cleanarch.data.repository.CustomerRepository;
import com.lazuroz.cleanarch.data.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toEntity(customer);
        customerRepository.insert(customerEntity);
    }
}
