package cl.pruebaTecnica.usuariosrest.services;

import org.springframework.beans.factory.annotation.Autowired;

import cl.pruebaTecnica.usuariosrest.models.Phone;
import cl.pruebaTecnica.usuariosrest.repositories.PhoneRepository;

public class PhoneServiceImpl implements PhoneService {

	private PhoneRepository phoneRepository;

	@Autowired
	public PhoneServiceImpl(PhoneRepository phoneRepository) {
		this.phoneRepository = phoneRepository;
	}

	@Override
	public Phone save(Phone phone) {
		return phoneRepository.save(phone);

	}
}
