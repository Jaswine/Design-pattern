package com.jaswine.observer;


/**
 * 运行程序
 *
 * @author jaswine
 */
public class Main {

	public static void main(String[] args) {
		CCTV cctv = new CCTV();

		JSTV jstv = new JSTV(cctv);
		ZJTV zjtv = new ZJTV(cctv);
		SHTV shtv = new SHTV(cctv);

		cctv.setShowMap("CCTV12","中央电视台法制");
	}
}
