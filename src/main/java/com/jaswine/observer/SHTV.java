package com.jaswine.observer;

import java.util.Map;

/**
 * 上海电视台
 * @author Jaswine
 */
public class SHTV implements Observer,DisplayShow {
	private String show;

	/**
	 * 节目源头
	 */
	private Subject cctv;

	public SHTV(Subject cctv) {
		this.cctv = cctv;
		cctv.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("我是上海台;我正在播放：{"+show+"}");
	}


	@Override
	public void update(Map<String,String> showMap) {
		this.show = showMap.get("CCTV2");
		display();
	}
}
