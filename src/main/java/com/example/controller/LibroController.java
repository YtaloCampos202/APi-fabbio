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

import com.example.entity.Libro;
import com.example.services.LibroServices;

@RestController
@RequestMapping("/libro")
public class LibroController {

	@Autowired
	private LibroServices serLibros;
	
	@GetMapping("/lista")
	public List<Libro> lista(){
		return serLibros.listarTodos();
	}
	
	@GetMapping("/buscar/{codigo}")
	public Libro buscar(@PathVariable("codigo") Integer cod) {
		return serLibros.buscarPorID(cod);
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Libro bean) {
		serLibros.registrar(bean);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Libro bean) {
		serLibros.actualizar(bean);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		serLibros.eliminar(cod);
	}
}
