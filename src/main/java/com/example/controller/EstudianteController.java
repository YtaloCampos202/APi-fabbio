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

import com.example.entity.Estudiante;
import com.example.services.EstudianteServices;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

	@Autowired
	private EstudianteServices serEstudiante;
	
	@GetMapping("/lista")
	public List<Estudiante> lista(){
		return serEstudiante.listarTodos();
	}
	@GetMapping("/buscar/{codigo}")
	public Estudiante buscar(@PathVariable("codigo") Integer cod) {
		return serEstudiante.buscarPorID(cod);
	}
	@PostMapping("/registrar")
	public void registrar(@RequestBody Estudiante bean) {
		serEstudiante.registrar(bean);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Estudiante bean) {
		serEstudiante.actualizar(bean);
	}
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		serEstudiante.eliminar(cod);
	}
}
