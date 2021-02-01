package com.cvs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cvs.dto.IngestVarBean;

@Repository
public class IngestVarDaoImpl implements IngestVarDao {

	@Autowired
	@Qualifier("jdbcTemplate2")
	private JdbcTemplate jdbcTemplate2;

	final String SELECT_QUERY = "select * from INGEST_VAR_TEST";
	final String INSERT_QUERY = "insert into INGEST_VAR_TEST (REC_ID, VAL,INSERTED_DT) values (?, ?, ?)";
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate2;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate2 = jdbcTemplate;
	}

	@Override
	public List<IngestVarBean> getDatasf() {
		System.out.println("Inside Mapper");
		return jdbcTemplate2.query("select * from INGEST_VAR_TEST", new RowMapper<IngestVarBean>() {
			@Override
			public IngestVarBean mapRow(ResultSet rs, int rownumber) throws SQLException {
				System.out.println("Inside Mapper");
				IngestVarBean e = new IngestVarBean();
				e.setRec_id(rs.getInt("REC_ID"));
				e.setVal(rs.getString("VAL"));
				e.setInserted_dt(rs.getDate("INSERTED_DT"));
				return e;
			}
		});
	}

	@Override
	public int save(IngestVarBean bean) {
		return jdbcTemplate2.update(
				INSERT_QUERY,
				bean.getRec_id(), bean.getVal(),bean.getInserted_dt());
	}

}
