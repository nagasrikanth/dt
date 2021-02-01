package com.cvs.dao;

import java.util.List;

import com.cvs.dto.DevicesDataDTO;

public interface DataTransferDao {

	public int save(DevicesDataDTO dto);

	public void update(DevicesDataDTO dto);

	public void deleteById(int empID);

	public List<DevicesDataDTO> getData();

}
