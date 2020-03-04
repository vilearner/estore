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

public class FirstPage   {

  @JsonProperty("item_id")
  private String item_id = null;
  
  @JsonProperty("image")
  private String image = null;
  
  @JsonProperty("productname")
  private String productname = null;

  @JsonProperty("prod_desc")
  private String prod_desc = null;

  @JsonProperty("unit_price")
  private Float unit_price = null;
  
  @JsonProperty("stock")
  private Integer stock = null;
 

public FirstPage item_id(String item_id) {
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

  
  public FirstPage quantity(String image) {
    this.image = image;
    return this;
  }

  
  @ApiModelProperty(value = "")


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
  

  public FirstPage unit_price(Float unit_price) {
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
  
  
  public FirstPage productname(String productname) {
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

  
  public FirstPage prod_desc(String prod_desc) {
	    this.prod_desc = prod_desc;
	    return this;
	  }

	  /**
	   * Get item_id
	   * @return item_id
	  **/
	  @ApiModelProperty(value = "")


	  public String getProd_desc() {
			return prod_desc;
		}

	  public void setProd_desc(String prod_desc) {
			this.prod_desc = prod_desc;
		}

	  
	  public FirstPage stock(Integer stock) {
		    this.stock = stock;
		    return this;
		  }

		  /**
		   * Get item_id
		   * @return item_id
		  **/
		  @ApiModelProperty(value = "")


		  public Integer getStock() {
				return stock;
			}

		  public void setStock(Integer stock) {
				this.stock = stock;
			}

 

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstPage items = (FirstPage) o;
    return 
        Objects.equals(this.item_id, items.item_id) &&
        Objects.equals(this.image, items.image) &&
        Objects.equals(this.unit_price, items.unit_price) &&
        Objects.equals(this.stock, items.stock) &&
        Objects.equals(this.prod_desc, items.prod_desc);
  }
  @Override
  public int hashCode() {
    return Objects.hash(item_id, image, unit_price, stock,prod_desc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstPage {\n");
 
    sb.append("    item_id: ").append(toIndentedString(item_id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    productname: ").append(toIndentedString(productname)).append("\n");
    sb.append("    unit_price: ").append(toIndentedString(unit_price)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    prod_desc: ").append(toIndentedString(prod_desc)).append("\n");
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


