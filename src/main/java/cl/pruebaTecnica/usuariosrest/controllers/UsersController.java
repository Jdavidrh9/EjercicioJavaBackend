package cl.pruebaTecnica.usuariosrest.controllers;

import cl.pruebaTecnica.usuariosrest.models.Phone;
import cl.pruebaTecnica.usuariosrest.models.User;
import cl.pruebaTecnica.usuariosrest.services.UserService;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<User> findAll() {
		return userService.findAll();
	}

	@PostMapping
	public ResponseEntity<User> save(@Valid @RequestBody User user) {
		for (Phone telefono : user.getPhones()) {
			telefono.setUser(user);
		}
		User obj = userService.save(user);
		return new ResponseEntity<User>(obj, HttpStatus.OK);
	}

}
