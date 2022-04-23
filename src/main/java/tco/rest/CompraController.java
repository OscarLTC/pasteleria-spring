package tco.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tco.model.Compra;
import tco.services.CompraService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@PostMapping("/compra")
	public ResponseEntity<?> comprar(@RequestBody Compra compra) {
		compraService.guardarCompra(compra);
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
}
