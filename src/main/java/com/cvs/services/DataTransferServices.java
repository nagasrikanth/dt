package com.cvs.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvs.dao.DataTransferDao;
import com.cvs.dao.IngestVarDao;
import com.cvs.dto.DevicesDataDTO;
import com.cvs.dto.IngestVarBean;

import ch.qos.logback.classic.Logger;

@Service
public class DataTransferServices {

	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(DataTransferServices.class);

	@Autowired
	DataTransferDao dataTransferDao;

	@Autowired
	IngestVarDao ingestvardao;

	public List<DevicesDataDTO> getData() {
		LOGGER.info("DataTransferServices ---- getData");
		List<DevicesDataDTO> data = dataTransferDao.getData();
		return data;
	}

	public List<IngestVarBean> getDatasf() {
		LOGGER.info("DataTransferServices ---- getData");
		List<IngestVarBean> data = ingestvardao.getDatasf();
		return data;
	}

	public String postDataIntoSF(List<DevicesDataDTO> list){
		LOGGER.info("DataTransferServices ---- PostData");
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

		list.forEach(e -> {
			IngestVarBean bean = new IngestVarBean();
			bean.setRec_id(e.getId().intValue());
			bean.setVal(e.getDeviceName());
			try {
				bean.setInserted_dt(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(date));
				ingestvardao.save(bean);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		return "Success";
	}
}
