package com.lazuroz.cleanarch.core.data;

import com.lazuroz.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
