package com.sopragroup.springbatchdemo.bo;

import java.util.Date;

public class Djia {

	private float adjclose;
	private float close;
	private Date date;
	private String direction;
	private float high;
	private float low;
	private float open;
	private long volume;

	public float getAdjclose() {
		return adjclose;
	}

	public float getClose() {
		return close;
	}

	public Date getDate() {
		return date;
	}

	public String getDirection() {
		return direction;
	}

	public float getHigh() {
		return high;
	}

	public float getLow() {
		return low;
	}

	public float getOpen() {
		return open;
	}

	public long getVolume() {
		return volume;
	}

	public void setAdjclose(float adjclose) {
		this.adjclose = adjclose;
	}

	public void setClose(float close) {
		this.close = close;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public void setHigh(float high) {
		this.high = high;
	}

	public void setLow(float low) {
		this.low = low;
	}

	public void setOpen(float open) {
		this.open = open;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}
}
