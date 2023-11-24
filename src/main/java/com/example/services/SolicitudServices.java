package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Solicitud;
import com.example.repository.SolicitudRepository;

@Service
public class SolicitudServices {

	@Autowired
	private SolicitudRepository repo;
	
	public List<Solicitud> listarTodos(){
		return repo.findAll();
	}
	public void registrar(Solicitud bean) {
		repo.save(bean);
	}
	public void actualizar(Solicitud bean) {
		repo.save(bean);
	}
	public Solicitud buscarPorID(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
}
