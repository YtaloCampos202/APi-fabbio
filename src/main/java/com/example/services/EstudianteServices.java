package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Estudiante;
import com.example.repository.EstudianteRepository;

@Service
public class EstudianteServices {

	@Autowired
	private EstudianteRepository repo;
	
	public List<Estudiante> listarTodos(){
		return repo.findAll();
	}
	public void registrar(Estudiante bean) {
		repo.save(bean);
	}
	public void actualizar(Estudiante bean) {
		repo.save(bean);
	}
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	public Estudiante buscarPorID(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
}
