package com.ndangducbn.factorymethod.impl;

import com.ndangducbn.factorymethod.interfaces.Bank;

public class TpBank implements Bank {
    @Override
    public String getBank() {
        return "This is TP Bank";
    }
}
