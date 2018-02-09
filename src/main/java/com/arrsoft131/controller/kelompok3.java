package com.arrsoft131.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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
	
	@RequestMapping("/list-all")
	@ResponseBody
	public List<Pesanan> getPesanan(){
		List<Pesanan> listPesanan = pesanBusService.getAllPesan();
		return listPesanan;
	}
	
	@RequestMapping("/get/{code}")
	@ResponseBody
	public Pesanan getPesananByCode(@PathVariable String code){
		Pesanan pesanan = pesanBusService.getPesanByCode(code);
		return pesanan;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void savePesanan(@RequestBody Pesanan pesanan){
		pesanBusService.save(pesanan);
	}
	
	@RequestMapping(value="/updcode/{code}", method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void updatePesanan(@RequestBody Pesanan pesanan, @PathVariable String code){
		pesanBusService.updateByCode(code, pesanan);
	}
	
	@RequestMapping(value="/get-pemesan", method=RequestMethod.GET)
	@ResponseBody
	public List<Pesanan> getDataPemesananByIdPemesan(@RequestParam(value = "pemesan", required = false) int pemesan){
		List<Pesanan> listPemesan = pesanBusService.getDataPemesanByIdPemesan(pemesan);
		return listPemesan;
	}
	
	@RequestMapping(value="/get-pka/{kb}/{it}", method=RequestMethod.GET)
	@ResponseBody
	public List<Pesanan> getDataPesananByKeberangkatanAndIdTrayek(@PathVariable String kb, @PathVariable int it){
		List<Pesanan> listPesanan = pesanBusService.getDataPesananByKeberangkatanAndIdTrayek(kb, it);
		return listPesanan;
	}
}
