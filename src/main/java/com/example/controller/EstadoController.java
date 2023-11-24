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

import com.example.entity.Estado;
import com.example.services.EstadoServices;

@RestController
@RequestMapping("/estado")
public class EstadoController {

	@Autowired
	private EstadoServices serEstado;
	
	@GetMapping("/lista")
	public List<Estado> lista(){
		return serEstado.listarTodos();
	}
	@GetMapping("/buscar/{codigo}")
	public Estado buscar(@PathVariable("codigo") Integer cod) {
		return serEstado.buscarPorID(cod);
	}
	@PostMapping("/registrar")
	public void registrar(@RequestBody Estado bean) {
		serEstado.registrar(bean);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Estado bean) {
		serEstado.registrar(bean);
	}
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		serEstado.eliminar(cod);
	}
}
