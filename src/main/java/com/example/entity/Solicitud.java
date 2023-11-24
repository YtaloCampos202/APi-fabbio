package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_solicitud")
public class Solicitud {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_sol")
	private Integer cod_sol;
	@Column(name="fec_sol")
	private String fechaSolicitud;
	
	@ManyToOne
	@JoinColumn(name="cod_lib")
	private Libro libro;
	
	@ManyToOne
	@JoinColumn(name="cod_est")
	private Estudiante estudiante;
	
	@ManyToOne
	@JoinColumn(name="cod_esta")
	private Estado estado;
	
	@ManyToOne
	@JoinColumn(name="cod_usu")
	private Usuario usuario;

	public Integer getCod_sol() {
		return cod_sol;
	}

	public void setCod_sol(Integer cod_sol) {
		this.cod_sol = cod_sol;
	}

	public String getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(String fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
