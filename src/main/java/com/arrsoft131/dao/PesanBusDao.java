package com.arrsoft131.dao;

import java.util.List;

import com.arrsoft131.model.Pesanan;

public interface PesanBusDao {

	Pesanan getPesanByCode(String code);

	List<Pesanan> getPesanByPage(int page, int pageSize);

	void save(Pesanan pesanan);

	void update(Pesanan pesanan);

	List<Pesanan> getDataPesananByIdPemesan(int pemesan);

	List<Pesanan> getDataPesananByKeberangkatanAndIdTrayek(String kb, int it);

}
