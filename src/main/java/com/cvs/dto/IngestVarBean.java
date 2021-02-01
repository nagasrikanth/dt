package com.cvs.dto;

import java.util.Date;

public class IngestVarBean {

	private int rec_id;

	private Object val;

	private Date inserted_dt;

	public int getRec_id() {
		return rec_id;
	}

	public void setRec_id(int rec_id) {
		this.rec_id = rec_id;
	}

	public Object getVal() {
		return val;
	}

	public void setVal(Object val) {
		this.val = val;
	}

	public Date getInserted_dt() {
		return inserted_dt;
	}

	public void setInserted_dt(Date inserted_dt) {
		this.inserted_dt = inserted_dt;
	}
}
