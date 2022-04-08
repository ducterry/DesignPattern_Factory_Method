package com.ndangducbn.factorymethod.factory;

import com.ndangducbn.factorymethod.enums.BankEnums;
import com.ndangducbn.factorymethod.impl.TpBank;
import com.ndangducbn.factorymethod.impl.VietComBank;
import com.ndangducbn.factorymethod.interfaces.Bank;

public class BankFactory {
    private BankFactory() {
    }

    public static final Bank getBank(BankEnums typeBank) {
        switch (typeBank) {
            case VIETCOMBANK:
                return new VietComBank();
            case TPBANK:
                return new TpBank();
            default:
                throw new IllegalArgumentException("This Bank not support");
        }
    }
}
