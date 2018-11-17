package com.jaswine.observer;

import java.util.Map;

public class ZJTV implements Observer,DisplayShow {

	private String show;

	/**
	 * 节目源头
	 */
	private Subject cctv;

	public ZJTV(Subject cctv) {
		this.cctv = cctv;
		cctv.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("我是浙江台;我正在播放：{"+show+"}");
	}


	@Override
	public void update(Map<String,String> showMap) {
		this.show = showMap.get("CCTV6");
		display();
	}
}
