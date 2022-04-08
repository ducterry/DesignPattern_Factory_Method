package com.ndangducbn.factorymethod.impl;

import com.ndangducbn.factorymethod.interfaces.Bank;

public class VietComBank implements Bank {
    @Override
    public String getBank() {
        return "This is Vietcom Bank";
    }
}
