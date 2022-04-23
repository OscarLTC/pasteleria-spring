package tco.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tco.services.PastelService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("pastel")
public class PastelRest {
	
	@Autowired
	private PastelService pastelService;
	
	@GetMapping("/pasteles")
	public ResponseEntity<?> pasteles(){
		return ResponseEntity.status(HttpStatus.OK).body(pastelService.findAll());
	}
	
	
	@GetMapping("/pasteles/{id}")
	public ResponseEntity<?> detalle(@PathVariable("id") Long id){
		return ResponseEntity.status(HttpStatus.OK).body(pastelService.findById(id));
	}
	
	@GetMapping("/categoria/{id}")
	public ResponseEntity<?> buscarCategoria(@PathVariable("id") Long id){
		return ResponseEntity.status(HttpStatus.OK).body(pastelService.buscarCategoria(id));
	}
	
	@GetMapping("/ranking")
	public ResponseEntity<?> ranking(){
		return ResponseEntity.status(HttpStatus.OK).body(pastelService.ranking());
	}
	
	@GetMapping("/buscar/{nombre}")
	public ResponseEntity<?> buscar(@PathVariable("nombre") String nombre){
		return ResponseEntity.status(HttpStatus.OK).body(pastelService.buscar(nombre));
	}
	
}
