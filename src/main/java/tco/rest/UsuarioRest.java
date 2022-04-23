package tco.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tco.model.Login;
import tco.model.Usuario;
import tco.services.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("usuario")
public class UsuarioRest {

		@Autowired
		private UsuarioService usuarioService;
		
		
		@PostMapping("/registrar")
		public ResponseEntity<?> save(@RequestBody Usuario usuario) {
			return ResponseEntity.status(HttpStatus.OK).body(usuarioService.save(usuario));
			
		}
		
		@PostMapping("/login")
		public ResponseEntity<?> login(@RequestBody Login login){
			return ResponseEntity.status(HttpStatus.OK).body(usuarioService.login(login.getName(), login.getPass()));
		}
}
