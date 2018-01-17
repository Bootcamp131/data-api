package com.arrsoft131.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arrsoft131.dao.PesanBusDao;
import com.arrsoft131.model.Pesanan;

@Transactional
@Service
public class PesanBusService {

	@Autowired
	PesanBusDao pesanBusDao;
	
	public Pesanan getPesanByCode(String code) {
		// TODO Auto-generated method stub
		return pesanBusDao.getPesanByCode(code);
	}

	public List<Pesanan> getPesanByPage(int page, int pageSize) {
		// TODO Auto-generated method stub
		return pesanBusDao.getPesanByPage(page, pageSize);
	}

	public void save(Pesanan pesanan) {
		// TODO Auto-generated method stub
		pesanBusDao.save(pesanan);
	}

	public void updateByCode(String code, Pesanan pesanan) {
		// TODO Auto-generated method stub
		Pesanan pesan = pesanBusDao.getPesanByCode(code);
		pesan.setStatusConfirm(pesanan.getStatusConfirm());
		pesanBusDao.update(pesan);
	}

	public List<Pesanan> getDataPemesanByIdPemesan(int pemesan) {
		// TODO Auto-generated method stub
		return pesanBusDao.getDataPesananByIdPemesan(pemesan);
	}

	public List<Pesanan> getDataPesananByKeberangkatanAndIdTrayek(String kb, String it) {
		// TODO Auto-generated method stub
		return pesanBusDao.getDataPesananByKeberangkatanAndIdTrayek(kb, it);
	}

	
}
