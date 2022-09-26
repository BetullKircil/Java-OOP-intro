package com.betulkircil.methodsandclasses;

import android.icu.util.CurrencyAmount;

public class Cities {
    public static void main(String[] args){
        //new'ledigimizde bellekte bu customeManager icin stack bellekte alan olustururuz.
        //bir classı kullanabilmek icin onun instance'sini kullanmamiz gerekir.
        //stack bellekte variable tutulur, heap bellekte referansi tutulur ve eger bu referans kullanılmazsa garbage collector tarafından yok edilir.
        //sadece ihtiyac duydugumuz zaman new'lemeliyiz

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.delete();
        customerManager.update();


    }
}
