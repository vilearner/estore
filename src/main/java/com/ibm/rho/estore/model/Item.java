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
 * Item
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-24T08:05:32.010Z")

public class Item   {

  @JsonProperty("cart_id")
  private String cart_id = null;
  
  @JsonProperty("customerid")
  private String customerid = null;
  
  @JsonProperty("itemid")
  private String itemid=null;




	@JsonProperty("quantity")
    private Integer quantity = null;



 

 


 

public Item cart_id(String cart_id) {
    this.cart_id = cart_id;
    return this;
  }

  /**
   * Get cart_id
   * @return cart_id
  **/
  @ApiModelProperty(value = "")


  public String getCart_id() {
		return cart_id;
	}

	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}
	
	public Item customerid(String customerid) {
	    this.customerid = customerid;
	    return this;
	  }

	  /**
	   * Get customerid
	   * @return customerid
	  **/
	  @ApiModelProperty(value = "")	

  public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public Item itemid(String itemid) {
	    this.itemid = itemid;
	    return this;
	  }

	  /**
	   * Get itemid
	   * @return itemid
	  **/
	  @ApiModelProperty(value = "")	
	
    public String getItemid() {
    	return itemid;
    }

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	
	
	
public Item quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }
  
  

  /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  

  

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return 
        Objects.equals(this.cart_id, item.cart_id) &&
        Objects.equals(this.customerid, item.customerid) &&
        Objects.equals(this.itemid, item.itemid) &&
        Objects.equals(this.quantity, item.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cart_id, customerid, itemid, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
 
    sb.append("    cart_id: ").append(toIndentedString(cart_id)).append("\n");
    sb.append("    customerid: ").append(toIndentedString(customerid)).append("\n");
    sb.append("    itemid: ").append(toIndentedString(itemid)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

