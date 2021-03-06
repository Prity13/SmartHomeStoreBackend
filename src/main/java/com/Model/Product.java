package com.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
@Entity
public class Product  implements Serializable
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   @Id
//@GeneratedValue
  private int pid;
  private String pname;
  private String pdescription;
  private double pPrice;
  private int stock;
  @ManyToOne(fetch=FetchType.EAGER)
  @JoinColumn(name="cid")
  private Category category;

  @ManyToOne(fetch=FetchType.EAGER)
  @JoinColumn(name="sid")
  private Supplier supplier;

  
@Transient
  MultipartFile pimage;
  private String imgName;
  public int getPid() {
	return pid;
  }
   public void setPid(int pid) {
	this.pid = pid;
   }
   public String getPname() {
	return pname;
  }
   public void setPname(String pname) {
	this.pname = pname;
  }

   public String getPdescription() {
	return pdescription;
  }
  public void setPdescription(String pdescription) {
	this.pdescription = pdescription;
  }
   
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public MultipartFile getPimage() {
	return pimage;
}
public void setPimage(MultipartFile pimage) {
	this.pimage = pimage;
}
public String getImgName() {
	return imgName;
}
public void setImgName(String imgName) {
	this.imgName = imgName;
}
public Category getCategory() {
	return category;
	
}
public void setCategory(Category category) {
	this.category=category;
	
}
public void setSupplier(Supplier supplier) {
this.supplier=supplier;	
	
}
  
public Supplier getSupplier() {
 return supplier;	
	
}
public double getpPrice() {
	return pPrice;
}
public void setpPrice(double pPrice) {
	this.pPrice = pPrice;
}

  

}
