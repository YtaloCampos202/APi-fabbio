package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Usuario;
import com.example.repository.UsuarioRepository;

@Service
public class UsuarioServices {

	@Autowired
	private UsuarioRepository repo;
	
	public List<Usuario> listarTodos(){
		return repo.findAll();
	}
	public void registrar(Usuario bean) {
		repo.save(bean);
	}
	public void actualizar(Usuario bean) {
		repo.save(bean);
	}
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	public Usuario buscarPorID(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
}
