package com.example.WalletService.Util;

import com.example.WalletService.Model.Wallet;

import java.util.Objects;

public class WalletValidator {
    public boolean validateWalletRequest(Wallet wallet){

        if (Objects.isNull(wallet)){
            return false;
        }else if (wallet.getIs_active() != true){
            return false;
        }else {
            return true;
        }


    }
}
