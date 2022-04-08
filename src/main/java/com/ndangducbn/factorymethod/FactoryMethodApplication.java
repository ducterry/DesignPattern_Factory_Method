package com.ndangducbn.factorymethod;

import com.ndangducbn.factorymethod.enums.BankEnums;
import com.ndangducbn.factorymethod.factory.BankFactory;
import com.ndangducbn.factorymethod.interfaces.Bank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryMethodApplication {

    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankEnums.VIETCOMBANK);

        System.out.println(bank.getBank());
    }

}
