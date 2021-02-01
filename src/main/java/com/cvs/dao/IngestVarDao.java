package com.cvs.dao;

import java.util.List;

import com.cvs.dto.DevicesDataDTO;
import com.cvs.dto.IngestVarBean;

public interface IngestVarDao {

	public List<IngestVarBean> getDatasf();
	
	public int save(IngestVarBean bean);
}
