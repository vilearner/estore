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

public class InvItem   {

  @JsonProperty("item_id")
  private String item_id = null;
  
  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("unit_price")
  private Float unit_price = null;

  @JsonProperty("quantitySize")
  private Integer quantitySize = null;
 

  public InvItem quantitySize(Integer quantitySize) {
	    this.quantitySize = quantitySize;
	    return this;
	  }
 

public Integer getQuantitySize() {
	return quantitySize;
}

public void setQuantitySize(Integer quantitySize) {
	this.quantitySize = quantitySize;
}

public InvItem item_id(String item_id) {
    this.item_id = item_id;
    return this;
  }

  /**
   * Get item_id
   * @return item_id
  **/
  @ApiModelProperty(value = "")


  public String getInvItem_id() {
		return item_id;
	}

	public void setInvItem_id(String item_id) {
		this.item_id = item_id;
	}

  public InvItem quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get productName
   * @return productName
  **/
  @ApiModelProperty(value = "")


  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public InvItem unit_price(Float unit_price) {
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

  

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvItem item = (InvItem) o;
    return 
        Objects.equals(this.item_id, item.item_id) &&
        Objects.equals(this.quantity, item.quantity) &&
        Objects.equals(this.unit_price, item.unit_price) &&
        Objects.equals(this.quantitySize, item.quantitySize);
  }
  @Override
  public int hashCode() {
    return Objects.hash(item_id, quantity, unit_price,quantitySize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvItem {\n");
 
    sb.append("    item_id: ").append(toIndentedString(item_id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unit_price: ").append(toIndentedString(unit_price)).append("\n");
    sb.append("    quantitySize: ").append(toIndentedString(quantitySize)).append("\n");
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


