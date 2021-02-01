package com.cvs.dto;

import com.cvs.bean.Bean;

public class DevicesDataDTO extends Bean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DevicesDataDTO() {
		super();
	}

	private int deviceId;

	private String deviceName;

	private int deviceStatus;

	private String deviceLocation;

	private String deviceSenderPort;

	private String deviceRecieverPort;

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(int deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getDeviceLocation() {
		return deviceLocation;
	}

	public void setDeviceLocation(String deviceLocation) {
		this.deviceLocation = deviceLocation;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceSenderPort() {
		return deviceSenderPort;
	}

	public void setDeviceSenderPort(String deviceSenderPort) {
		this.deviceSenderPort = deviceSenderPort;
	}

	public String getDeviceRecieverPort() {
		return deviceRecieverPort;
	}

	public void setDeviceRecieverPort(String deviceRecieverPort) {
		this.deviceRecieverPort = deviceRecieverPort;
	}

}
