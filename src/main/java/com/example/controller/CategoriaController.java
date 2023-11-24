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

import com.example.entity.Categoria;
import com.example.services.CategoriaServices;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaServices serCategoria;
	
	@GetMapping("/lista")
	public List<Categoria> lista(){
		return serCategoria.listarTodos();
	}
	@GetMapping("/buscar/{codigo}")
	public Categoria buscar(@PathVariable("codigo") Integer cod){
		return serCategoria.buscarPorID(cod);
	}
	@PostMapping("/registrar")
	public void registrar(@RequestBody Categoria bean) {
		serCategoria.registrar(bean);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Categoria bean) {
		serCategoria.registrar(bean);
	}
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		serCategoria.eliminar(cod);
	}

}
