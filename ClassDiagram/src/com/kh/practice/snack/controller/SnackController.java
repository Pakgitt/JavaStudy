package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();

	public SnackController() {

	}

	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "" ;
	}
	
	public String confirmData() {
		String result = s.getKind() + s.getName()+ s.getFlavor() + s.getNumOf() + s.getPrice() ;
		
		return result;
		
	}

}
