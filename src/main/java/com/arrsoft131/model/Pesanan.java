package com.arrsoft131.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pesanan {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String codePesan;
	private int idTrayek;
	private int idPemesan;
	private String jamPesan;
	private String confirmJamPesan;
	private String statusConfirm;
	private String poolAwal;
	private String poolAkhir;
	private String tanggalPesan;
	private String tanggalKeberangkatan;
	private String tipePembayaran;
	private String atasNamaPemabayaran;
	private int jumlahSeatPesan;
	private int hargaTotal;
	
	public void setHargaTotal(int hargaTotal) {
		this.hargaTotal = hargaTotal;
	}
	
	public int getHargaTotal() {
		return hargaTotal;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCodePesan() {
		return codePesan;
	}

	public void setCodePesan(String codePesan) {
		this.codePesan = codePesan;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getIdTrayek() {
		return idTrayek;
	}
	public void setIdTrayek(int idTrayek) {
		this.idTrayek = idTrayek;
	}
	public int getIdPemesan() {
		return idPemesan;
	}
	public void setIdPemesan(int idPemesan) {
		this.idPemesan = idPemesan;
	}
	public String getJamPesan() {
		return jamPesan;
	}
	public void setJamPesan(String jamPesan) {
		this.jamPesan = jamPesan;
	}
	public String getConfirmJamPesan() {
		return confirmJamPesan;
	}
	public void setConfirmJamPesan(String confirmJamPesan) {
		this.confirmJamPesan = confirmJamPesan;
	}
	public String getStatusConfirm() {
		return statusConfirm;
	}
	public void setStatusConfirm(String statusConfirm) {
		this.statusConfirm = statusConfirm;
	}
	public String getPoolAwal() {
		return poolAwal;
	}
	public void setPoolAwal(String poolAwal) {
		this.poolAwal = poolAwal;
	}
	public String getPoolAkhir() {
		return poolAkhir;
	}
	public void setPoolAkhir(String poolAkhir) {
		this.poolAkhir = poolAkhir;
	}
	public String getTanggalPesan() {
		return tanggalPesan;
	}
	public void setTanggalPesan(String tanggalPesan) {
		this.tanggalPesan = tanggalPesan;
	}
	public String getTanggalKeberangkatan() {
		return tanggalKeberangkatan;
	}
	public void setTanggalKeberangkatan(String tanggalKeberangkatan) {
		this.tanggalKeberangkatan = tanggalKeberangkatan;
	}
	public String getTipePembayaran() {
		return tipePembayaran;
	}
	public void setTipePembayaran(String tipePembayaran) {
		this.tipePembayaran = tipePembayaran;
	}
	public String getAtasNamaPemabayaran() {
		return atasNamaPemabayaran;
	}
	public void setAtasNamaPemabayaran(String atasNamaPemabayaran) {
		this.atasNamaPemabayaran = atasNamaPemabayaran;
	}
	public int getJumlahSeatPesan() {
		return jumlahSeatPesan;
	}
	public void setJumlahSeatPesan(int jumlahSeatPesan) {
		this.jumlahSeatPesan = jumlahSeatPesan;
	}
	
	
	
}
