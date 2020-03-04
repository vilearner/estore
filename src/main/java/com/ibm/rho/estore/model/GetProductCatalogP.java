package com.ibm.rho.estore.model;

import com.ibm.rho.estore.model.Product;

public class GetProductCatalogP {

    private String productId;

    public GetProductCatalogP() {

    }

    public GetProductCatalogP(String productId) {
        this.productId = productId;
    }

    private String getproductId () {
        return productId;
    }

    private void setproductId (String productId) {
        this.productId = productId;
    }

}
