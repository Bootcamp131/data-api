package com.arrsoft131.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.arrsoft131.model.Pesanan;

@Repository
public class PesanBusDaoImpl implements PesanBusDao {

	@Autowired
	SessionFactory sessionFactory;
	public Pesanan getPesanByCode(String code) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Pesanan pesan where pesan.codePesan = :code";
		Query query = session.createQuery(hql).setParameter("code", code);
		List<Pesanan> listPesanan = query.list();
		if(listPesanan.isEmpty())
			return null;
		else
		return listPesanan.get(0);
	}
	
	public List<Pesanan> getPesanByPage(int page, int pageSize) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Pesanan");
		query.setFirstResult(page*pageSize);
		query.setMaxResults(pageSize);
		List<Pesanan> list = query.list();
		if(list.isEmpty())
			return null;
		else 
			return list;
	}

	public void save(Pesanan pesanan) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(pesanan);
		session.flush(); 
	}

	public void update(Pesanan pesanan) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(pesanan);
		session.flush(); 
	}

	public List<Pesanan> getDataPesananByIdPemesan(int pemesan) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Pesanan pesan where pesan.idPemesan = :pemesan";
		Query query = session.createQuery(hql).setParameter("pemesan", pemesan);
		List<Pesanan> listPesanan = query.list();
		if(listPesanan.isEmpty()){
			return null;
		}
		return listPesanan;
	}

	public List<Pesanan> getDataPesananByKeberangkatanAndIdTrayek(String kb, String it) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Pesanan pesan where pesan.idTrayek = :it and pesan.tanggalKeberangkatan = :kb";
		Query query = session.createQuery(hql).setParameter("kb", kb).setParameter("it", it);
		List<Pesanan> listPesanan = query.list();
		if(listPesanan.isEmpty()){
			return null;
		}
		return listPesanan;
	}

}
