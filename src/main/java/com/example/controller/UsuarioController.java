package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Usuario;
import com.example.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioServices serUsuario;
	
	@GetMapping("/lista")
	public List<Usuario> lista(){
		return serUsuario.listarTodos();
	}
	@GetMapping("/buscar/{codigo}")
	public Usuario buscar(@PathVariable("codigo") Integer cod) {
		return serUsuario.buscarPorID(cod);
	}
	@PostMapping("/registrar")
	public void registrar(@RequestBody Usuario bean) {
		serUsuario.registrar(bean);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usuario bean) {
		serUsuario.actualizar(bean);
	}
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		serUsuario.eliminar(cod);
	}
}
