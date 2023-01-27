package com.cal;

public class SlowApi {

	//API: application programmer interface , REST api
	public String getCityName(int id) {
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return "rai pur";
	}
}
