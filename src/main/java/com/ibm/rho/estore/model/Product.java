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

public class Product   {

  @JsonProperty("productId")
  private String productId = null;
  
  @JsonProperty("productName")
  private String productName = null;
  
  @JsonProperty("partNo")
  private String partNo=null;

  @JsonProperty("imageLink")
  private String imageLink = null;
  
  @JsonProperty("productShortDesc")
  private String productShortDesc = null;



public Product productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")


  public String getproductId() {
		return productId;
	}

	public void setproductId(String productId) {
		this.productId = productId;
	}
	
	public Product productName(String productName) {
	    this.productName = productName;
	    return this;
	  }

	  /**
	   * Get productName
	   * @return productName
	  **/
	  @ApiModelProperty(value = "")	

  public String getproductName() {
		return productName;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}

	public Product partNo(String partNo) {
	    this.partNo = partNo;
	    return this;
	  }

	  /**
	   * Get partNo
	   * @return partNo
	  **/
	  @ApiModelProperty(value = "")	
	
    public String getpartNo() {
    	return partNo;
    }

	public void setpartNo(String partNo) {
		this.partNo = partNo;
	}
	
	
	
public Product imageLink(String imageLink) {
    this.imageLink = imageLink;
    return this;
  }
  
  

  /**
   * Get imageLink
   * @return imageLink
  **/
  @ApiModelProperty(value = "")


  public String getimageLink() {
    return imageLink;
  }

  public void setimageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  
  public Product productShortDesc(String productShortDesc) {
	    this.productShortDesc = productShortDesc;
	    return this;
	  }
	  
	  

	  /**
	   * Get productShortDesc
	   * @return productShortDesc
	  **/
	  @ApiModelProperty(value = "")


	  public String getproductShortDesc() {
	    return productShortDesc;
	  }

	  public void setproductShortDesc(String productShortDesc) {
	    this.productShortDesc = productShortDesc;
	  }
  

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product item = (Product) o;
    return 
        Objects.equals(this.productId, item.productId) &&
        Objects.equals(this.productName, item.productName) &&
        Objects.equals(this.partNo, item.partNo) &&
        Objects.equals(this.imageLink, item.imageLink) &&
        Objects.equals(this.productShortDesc, item.productShortDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productName, partNo, imageLink, productShortDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
 
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    partNo: ").append(toIndentedString(partNo)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    productShortDesc: ").append(toIndentedString(productShortDesc)).append("\n");
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

