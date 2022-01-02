package cl.pruebaTecnica.usuariosrest.services;

import java.util.List;

import cl.pruebaTecnica.usuariosrest.models.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

}
