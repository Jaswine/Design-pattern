package com.jaswine.observer;

import java.util.Map;

/**
 * 江苏电视台
 * Description:江苏电视台只转播了中央台的CCTV1
 *
 * @author Jaswine
 */
public class JSTV implements Observer,DisplayShow {

	/**
	 * 节目
	 */
	private String show;
	/**
	 * 节目源头
	 */
	private Subject cctv;

	public JSTV(Subject subject) {
		this.cctv = subject;
		cctv.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("我是江苏台;我正在播放：{"+show+"}");
	}


	@Override
	public void update(Map<String,String> showMap) {
		this.show = showMap.get("CCTV1");
		display();
	}
}
