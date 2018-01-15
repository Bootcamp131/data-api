package com.arrsoft131.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arrsoft131.model.Pesanan;
import com.arrsoft131.service.PesanBusService;

@Controller
@RequestMapping("/kelompok3-ws")
public class kelompok3 {

	@Autowired
	PesanBusService pesanBusService;
	
	@RequestMapping
	@ResponseBody
	public String index(){
		return "ws untuk kelompok 3, rizky, winda dan fauzy.";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Pesanan> getPesanan(@RequestParam(value="page", defaultValue="0" ) int page){
		int pageSize = 10; //perPage
		List<Pesanan> listPesanan = pesanBusService.getPesanByPage(page, pageSize);
		
		return listPesanan;
	}
	
	@RequestMapping("/get/{code}")
	public Pesanan getPesananByCode(@PathVariable String code){
		Pesanan pesanan = pesanBusService.getPesanByCode(code);
		return pesanan;
	}
	
	
}
