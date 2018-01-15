package com.arrsoft131.dao;

import java.util.List;

import com.arrsoft131.model.Pesanan;

public interface PesanBusDao {

	Pesanan getPesanByCode(String code);

	List<Pesanan> getPesanByPage(int page, int pageSize);

}
