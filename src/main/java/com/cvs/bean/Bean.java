package com.cvs.bean;

import java.io.Serializable;
import java.util.Date;

public class Bean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Bean() {
		super();
	}

	private Long id;

	private Long idCustomerCreation;

	private Date creationDate;

	private Long idCustomerUpdation;

	private Date updationDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdCustomerCreation() {
		return idCustomerCreation;
	}

	public void setIdCustomerCreation(Long idCustomerCreation) {
		this.idCustomerCreation = idCustomerCreation;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getIdCustomerUpdation() {
		return idCustomerUpdation;
	}

	public void setIdCustomerUpdation(Long idCustomerUpdation) {
		this.idCustomerUpdation = idCustomerUpdation;
	}

	public Date getUpdationDate() {
		return updationDate;
	}

	public void setUpdationDate(Date updationDate) {
		this.updationDate = updationDate;
	}

}
