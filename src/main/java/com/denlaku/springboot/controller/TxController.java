package com.denlaku.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.denlaku.springboot.service.TxService;
import com.denlaku.springboot.vo.Tx;

@RestController
@RequestMapping("/tx")
public class TxController {

	@Autowired
	private TxService txService;
	
	@RequestMapping("/add")
	public void add(Tx tx) {
		txService.add(tx);
	}
}
