package com.jaswine.observer;


/**
 * 被订阅对象规范
 *
 * @author Jaswine
 */
public interface Subject {

	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}
