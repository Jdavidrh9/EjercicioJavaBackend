package cl.pruebaTecnica.usuariosrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.pruebaTecnica.usuariosrest.models.User;
import cl.pruebaTecnica.usuariosrest.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User save(User user) {

		List<User> usuarios = userRepository.findAll();
		
		//Se valida antes de guardar, que el correo ingresado por el usuario no exista en otro registro de la base de datos
		
		for (User str : usuarios) {
			if (str.getEmail().equals(user.getEmail())) {
				System.out.println("El correo ingresado ya existe");
				;
				return null;
			}
		}

		return userRepository.save(user);

	}

	@Override
	public List<User> findAll() {

		List<User> usuarios = userRepository.findAll();

		return usuarios;
	}

}
