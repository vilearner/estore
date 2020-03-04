package com.ibm.rho.estore.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InvItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-24T08:05:32.010Z")

public class LastPage   {

  @JsonProperty("cart_id")
  private String cart_id = null;
	
  @JsonProperty("item_id")
  private String item_id = null;
  
  @JsonProperty("productname")
  private String productname = null;

  @JsonProperty("unit_price")
  private Float unit_price = null;
  
  @JsonProperty("quantity")
  private Integer quantity = null;



  public LastPage cart_id(String cart_id) {
	    this.cart_id = cart_id;
	    return this;
	  }

	  /**
	   * Get item_id
	   * @return item_id
	  **/
	  @ApiModelProperty(value = "")


	  public String getCart_id() {
			return cart_id;
		}

	  public void setCart_id(String cart_id) {
			this.cart_id = cart_id;
		}
  
  
  public LastPage item_id(String item_id) {
    this.item_id = item_id;
    return this;
  }

  /**
   * Get item_id
   * @return item_id
  **/
  @ApiModelProperty(value = "")


  public String getItem_id() {
		return item_id;
	}

  public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

  
  public LastPage quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  
  @ApiModelProperty(value = "")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
  

  public LastPage unit_price(Float unit_price) {
    this.unit_price = unit_price;
    return this;
  }

  /**
   * Get unit_price
   * @return unit_price
  **/
  @ApiModelProperty(value = "")


  public Float getUnit_price() {
		return unit_price;
  }

  public void setUnit_price(Float unit_price) {
		this.unit_price = unit_price;
  }

  
  public LastPage productname(String productname) {
	    this.productname = productname;
	    return this;
	  }

	  /**
	   * Get item_id
	   * @return item_id
	  **/
	  @ApiModelProperty(value = "")


	  public String getProductname() {
			return productname;
		}

	  public void setProductname(String productname) {
			this.productname = productname;
		}

	  
	  
  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastPage items = (LastPage) o;
    return 
        Objects.equals(this.item_id, items.item_id) &&
        Objects.equals(this.cart_id, items.cart_id) &&
        Objects.equals(this.unit_price, items.unit_price) &&
        Objects.equals(this.quantity, items.quantity) &&
        Objects.equals(this.productname, items.productname);
  }
  @Override
  public int hashCode() {
    return Objects.hash(item_id, cart_id, unit_price, quantity, productname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastPage {\n");
 
    sb.append("    item_id: ").append(toIndentedString(item_id)).append("\n");
    sb.append("    cart_id: ").append(toIndentedString(cart_id)).append("\n");
    sb.append("    unit_price: ").append(toIndentedString(unit_price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    prod_desc: ").append(toIndentedString(productname)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


