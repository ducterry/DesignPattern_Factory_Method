package com.ndangducbn.factorymethod.enums;

public enum BankEnums {
    VIETCOMBANK("VCB", "VIETCOMBANK", "Ngân hàng Ngoại thương Việt Nam"),
    TPBANK("TPB", "TPBANK", "Ngân hàng Tiên Phong");
    String bankCode;
    String bankName;
    String bankDescription;

    BankEnums(String bankCode, String bankName, String bankDescription) {
        this.bankCode = bankCode;
        this.bankName = bankName;
        this.bankDescription = bankDescription;
    }

    public String getBankCode() {
        return bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankDescription() {
        return bankDescription;
    }
}
