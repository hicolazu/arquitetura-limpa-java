package com.lazuroz.cleanarch.core.usecase;

import com.lazuroz.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(final Customer customer, final String zipCode);
}
