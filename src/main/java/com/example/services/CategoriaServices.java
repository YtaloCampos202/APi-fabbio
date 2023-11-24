package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Categoria;
import com.example.repository.CategoriaRepository;

@Service
public class CategoriaServices {

	@Autowired
	private CategoriaRepository repo;
	
	public List<Categoria> listarTodos(){
		return repo.findAll();
	}
	public void registrar(Categoria bean) {
		repo.save(bean);
	}
	public void actualizar(Categoria bean) {
		repo.save(bean);
	}
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	public Categoria buscarPorID(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
}
