package com.cvs.dto;
import java.io.Serializable;
import java.util.Date;

public class DataTransferDTO implements Serializable {
/**
* 
*/
private static final long serialVersionUID = 1L;
/**
* 
*/
public DataTransferDTO() {
super();
}

/** The id. */
private Long id;

private Long idCustomerCreation;

private Date creationDate;

private Long idCustomerUpdation;

private Date updationDate;

private byte[] data;

private Character isActive;

private Character isProcessed;

/**
* Gets the id.
*
* @return the id
*/
public Long getId() {
return id;
}

/**
* Sets the id.
*
* @param id the new id
*/
public void setId(Long id) {
this.id = id;
}

/**
* @return the idCustomerCreation
*/
public Long getIdCustomerCreation() {
return idCustomerCreation;
}

/**
* @param idCustomerCreation
*            the idCustomerCreation to set
*/
public void setIdCustomerCreation(Long idCustomerCreation) {
this.idCustomerCreation = idCustomerCreation;
}

/**
* @return the creationDate
*/
public Date getCreationDate() {
return creationDate;
}

/**
* @param creationDate
*            the creationDate to set
*/
public void setCreationDate(Date creationDate) {
this.creationDate = creationDate;
}

/**
* @return the idCustomerUpdation
*/
public Long getIdCustomerUpdation() {
return idCustomerUpdation;
}

/**
* @param idCustomerUpdation
*            the idCustomerUpdation to set
*/
public void setIdCustomerUpdation(Long idCustomerUpdation) {
this.idCustomerUpdation = idCustomerUpdation;
}

/**
* @return the updationDate
*/
public Date getUpdationDate() {
return updationDate;
}

/**
* @param updationDate
*            the updationDate to set
*/
public void setUpdationDate(Date updationDate) {
this.updationDate = updationDate;
}

/**
* @return the data
*/
public byte[] getData() {
return data;
}

/**
* @param data the data to set
*/
public void setData(byte[] data) {
this.data = data;
}

/**
* @return the isActive
*/
public Character getIsActive() {
return isActive;
}

/**
* @param isActive the isActive to set
*/
public void setIsActive(Character isActive) {
this.isActive = isActive;
}

/**
* @return the isProcessed
*/
public Character getIsProcessed() {
return isProcessed;
}

/**
* @param isProcessed the isProcessed to set
*/
public void setIsProcessed(Character isProcessed) {
this.isProcessed = isProcessed;
}

}
