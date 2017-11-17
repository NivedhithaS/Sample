package com.interview.model;
/**
 * FeatureDetail class is the class for keeping Features that use by model
 * 
 * @author <a href="mailto:jingyuzhang2008@gmail.com">Jingyu ZHANG</a>
 * @version  1.0
 * @since May 2016
 **/
public class FeatureDetail {
	public FeatureDetail(){
		
	}
	public FeatureDetail(int pre, int curr, int next){
		this.pre = pre;
		this.curr = curr;
		this.next = next;
	}
	public int getPre() {
		return pre;
	}
	public void setPre(int pre) {
		this.pre = pre;
	}
	public int getCurr() {
		return curr;
	}
	public void setCurr(int curr) {
		this.curr = curr;
	}
	public int getNext() {
		return next;
	}
	public void setNext(int next) {
		this.next = next;
	}
	private int pre;
	private int curr;
	private int next;

	
}
