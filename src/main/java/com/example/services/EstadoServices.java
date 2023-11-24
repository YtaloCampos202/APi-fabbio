package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Estado;
import com.example.repository.EstadoRepository;

@Service
public class EstadoServices {

	@Autowired
	private EstadoRepository repo;
	
	public List<Estado> listarTodos(){
		return repo.findAll();
	}
	public void registrar(Estado bean) {
		repo.save(bean);
	}
	public void actualizar(Estado bean) {
		repo.save(bean);
	}
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	public Estado buscarPorID(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
}
