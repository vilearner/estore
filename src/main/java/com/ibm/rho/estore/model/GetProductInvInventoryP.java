package com.ibm.rho.estore.model;

import com.ibm.rho.estore.model.InvItem;

public class GetProductInvInventoryP {

    private String itemId;

    public GetProductInvInventoryP() {

    }

    public GetProductInvInventoryP(String itemId) {
        this.itemId = itemId;
    }

    private String getItemId () {
        return itemId;
    }

    private void setInvItemid (String itemId) {
        this.itemId = itemId;
    }

}
