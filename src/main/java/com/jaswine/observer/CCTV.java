package com.jaswine.observer;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 中央电视台
 * Description:所有的节目集中的地方，其他电视对他进行转播
 *
 * @author Jaswine
 */
public class CCTV implements Subject {

	/**
	 * 节目列表
	 */
	private Map<String,String> showMap;
	/**
	 * 转播者列表
	 */
	private List<Observer> observers;

	public CCTV() {
		observers = new ArrayList<Observer>();
		showMap = new HashMap<String,String>();
		showMap.put("CCTV1","中央电视台综合");
		showMap.put("CCTV2","中央电视台财经");
		showMap.put("CCTV3","中央电视台音乐");
		showMap.put("CCTV4","中央电视台国际");
		showMap.put("CCTV5","中央电视台体育");
		showMap.put("CCTV6","中央电视台电影");
		showMap.put("CCTV7","中央电视台军事");
		showMap.put("CCTV8","中央电视台电视剧");
	}


	/**
	 * 注册
	 * @param observer 订阅者(观察者)
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 移除
	 * @param observer 订阅者(观察者)
	 */
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * 通知
	 */
	@Override
	public void notifyObservers() {
		for (int i = 0;i < observers.size();i++){
			Observer observer = observers.get(i);
			observer.update(showMap);
		}
	}


	/**
	 * 设置节目
	 * @param showName
	 * @param showContent
	 */
	public void setShowMap(String showName,String showContent){
		showMap.put(showName,showContent);
		System.out.println("我是中央电视台，我更新了频道:{"+showName+"};节目内容是:{"+showContent+"}");
		notifyObservers();
	}
}
