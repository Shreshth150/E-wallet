package com.example.WalletService.Util;

import com.example.WalletService.Model.Transaction;

import java.util.Objects;

public class TransactionValidator {
    public boolean validateRequest (Transaction request){
        /*
        Write your logic to implement validation
         */
        if (Objects.isNull(request)){
            return false;
        }else if (request.getStatus() == null){
            return false;
        }else {
            return true ;
        }
    }
}
