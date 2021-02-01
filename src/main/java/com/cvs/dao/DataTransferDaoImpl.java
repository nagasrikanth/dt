package com.cvs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cvs.dao.DataTransferDao;
import com.cvs.dto.DevicesDataDTO;

@Repository
public class DataTransferDaoImpl implements DataTransferDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(DataTransferDaoImpl.class);
	@Autowired
	@Qualifier("jdbcTemplate1")
	private JdbcTemplate jdbcTemplate1;

	final String INSERT_QUERY = "insert into employee (name, age) values (?, ?)";
	final String SELECT_QUERY = "select * from devices_info";
	final String UPDATE_QUERY = "update employee set age = ? where id = ?";
	final String DELETE_QUERY = "delete from employee where id = ?";

	@Override
	public void deleteById(int empId) {
		LOGGER.info("DataTransferDaoImpl ------ deleteById");
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate1;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate1 = jdbcTemplate;
	}

	public List<DevicesDataDTO> getData() {
		System.out.println("Inside Mapper");
		return jdbcTemplate1.query("select * from devices_info", new RowMapper<DevicesDataDTO>() {
			@Override
			public DevicesDataDTO mapRow(ResultSet rs, int rownumber) throws SQLException {
				System.out.println("Inside Mapper");
				DevicesDataDTO e = new DevicesDataDTO();
				e.setId(rs.getLong("ID"));
				e.setDeviceName(rs.getString("STR_DEVICE_NAME"));
				e.setDeviceId(rs.getInt("INT_DEVICE_ID"));
				e.setDeviceLocation(rs.getString("STR_DEVICE_LOCATION"));
				return e;
			}
		});
	}

	@Override
	public int save(DevicesDataDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(DevicesDataDTO dto) {
		// TODO Auto-generated method stub

	}

	

}
