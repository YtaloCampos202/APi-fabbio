package com.example.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_estado")
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_est")
	private Integer codigo;
	@Column(name="des_est")
	private String descricpion;
	
	@OneToMany(mappedBy = "estado")
	@JsonIgnore
	private List<Solicitud> listaSolicitudes;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricpion() {
		return descricpion;
	}

	public void setDescricpion(String descricpion) {
		this.descricpion = descricpion;
	}

	public List<Solicitud> getListaSolicitudes() {
		return listaSolicitudes;
	}

	public void setListaSolicitudes(List<Solicitud> listaSolicitudes) {
		this.listaSolicitudes = listaSolicitudes;
	}
}
