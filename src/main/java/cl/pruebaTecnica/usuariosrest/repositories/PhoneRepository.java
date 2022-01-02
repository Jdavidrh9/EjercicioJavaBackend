package cl.pruebaTecnica.usuariosrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.pruebaTecnica.usuariosrest.models.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long>{

}
