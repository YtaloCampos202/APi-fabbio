package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Solicitud;
import com.example.services.SolicitudServices;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {

	@Autowired
	private SolicitudServices serSolicitud;
	
	@GetMapping("/lista")
	public List<Solicitud> lista(){
		return serSolicitud.listarTodos();
	}
	
	@GetMapping("/buscar/{codigo}")
	public Solicitud buscar(@PathVariable("codigo") Integer cod) {
		return serSolicitud.buscarPorID(cod);
	}
	@PostMapping("/registrar")
	public void registrar(@RequestBody Solicitud bean) {
		serSolicitud.registrar(bean);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Solicitud bean) {
		serSolicitud.actualizar(bean);
	}
}
