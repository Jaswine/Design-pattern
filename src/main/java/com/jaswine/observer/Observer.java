package com.jaswine.observer;


import java.util.Map;

/**
 * 订阅者(观察者)规范
 *
 * @author Jaswine
 */
public interface Observer {

	void update(Map<String,String> showMap);
}
