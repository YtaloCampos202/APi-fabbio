package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Libro;
import com.example.repository.LibroRepository;

@Service
public class LibroServices {

	@Autowired
	private LibroRepository repo;
	
	public List<Libro> listarTodos(){
		return repo.findAll();
	}
	public void registrar(Libro bean) {
		repo.save(bean);
	}
	public void actualizar(Libro bean) {
		repo.save(bean);
	}
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	public Libro buscarPorID(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
}
