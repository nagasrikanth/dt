package com.cvs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cvs.dto.DevicesDataDTO;
import com.cvs.dto.IngestVarBean;
import com.cvs.services.DataTransferServices;

@RestController
@RequestMapping("/data")
public class DataTransferController {
	private static final Logger LOGGER = LoggerFactory.getLogger(DataTransferController.class);
	@Autowired
	DataTransferServices services;

	@GetMapping(value = "/getdata")
	public ResponseEntity<List<DevicesDataDTO>> getData() {

		LOGGER.info("LOGGER ---- DataTransferController");
		List<DevicesDataDTO> data = services.getData();
		if (null != data && !data.isEmpty()) {

		} else {
			System.out.println("EMPHTY---LIST");
		}
		data.forEach(e -> {
			System.out.println("Device ID" + e.getDeviceId());
			System.out.println("Device Name" + e.getDeviceName());
			System.out.println("Device Name" + e.getDeviceLocation());
		});
		return new ResponseEntity<List<DevicesDataDTO>>(data, HttpStatus.OK);
	}

	@GetMapping(value = "/getdatasf")
	public ResponseEntity<List<IngestVarBean>> getDatasf() {

		LOGGER.info("LOGGER ---- DataTransferController");
		List<IngestVarBean> data = services.getDatasf();
		if (null != data && !data.isEmpty()) {

		} else {
			System.out.println("EMPHTY---LIST");
		}
		data.forEach(e -> {
			System.out.println("Device ID" + e.getRec_id());
			System.out.println("Device Name" + e.getVal());
			System.out.println("Device Name" + e.getInserted_dt());
		});
		return new ResponseEntity<List<IngestVarBean>>(data, HttpStatus.OK);
	}

	@GetMapping(value = "/postdata")
	public ResponseEntity<String> postData() {
		String result ="fail";
		LOGGER.info("LOGGER ---- DataTransferController");
		List<DevicesDataDTO> data = services.getData();
		if (null != data && !data.isEmpty()) {
			services.postDataIntoSF(data);
		} else {
			System.out.println("EMPHTY---LIST");
		}
		
		return new ResponseEntity<String>(result, HttpStatus.OK);	
	}
}
