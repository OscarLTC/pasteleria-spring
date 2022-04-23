package tco.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tco.services.CategoriaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("categoria")
public class CategoriaRest {

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/categorias")
	public ResponseEntity<?> categorias() {
		return ResponseEntity.status(HttpStatus.OK).body(categoriaService.findAll());
	}
}
