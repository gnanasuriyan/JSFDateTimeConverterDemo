package com.pointerunits;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="dateTimeBean")
@SessionScoped
public class DateTimeConveterDemo {

	private Date todayDate;
	public DateTimeConveterDemo() {

	}
	
	public Date getTodayDate() {
		return todayDate;
	}
	
	public void setTodayDate(Date todayDate) {
		this.todayDate = todayDate;
	}
	
}
