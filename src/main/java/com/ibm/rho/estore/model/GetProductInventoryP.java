package com.ibm.rho.estore.model;

import com.ibm.rho.estore.model.Item;

public class GetProductInventoryP {

    private String itemId;

    public GetProductInventoryP() {

    }

    public GetProductInventoryP(String itemId) {
        this.itemId = itemId;
    }

    private String getItemId () {
        return itemId;
    }

    private void setItemId (String itemId) {
        this.itemId = itemId;
    }

}
