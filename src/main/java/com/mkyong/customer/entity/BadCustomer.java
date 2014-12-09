package com.mkyong.customer.entity;

import javax.inject.Named;

@Named
public class BadCustomer {

	private String voice;
	private int count;

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void character() {
		System.out.println("voice is very loud");
	}

}
