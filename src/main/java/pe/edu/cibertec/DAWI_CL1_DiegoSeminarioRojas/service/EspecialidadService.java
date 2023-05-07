package pe.edu.cibertec.DAWI_CL1_DiegoSeminarioRojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.DAWI_CL1_DiegoSeminarioRojas.model.EspecialidadClass;
import pe.edu.cibertec.DAWI_CL1_DiegoSeminarioRojas.repository.EspecialidadRepository;

@Service
public class EspecialidadService{
	@Autowired
	private EspecialidadRepository especialidadRepository;
	
	public List<EspecialidadClass> listarEspecialidad() {
		return especialidadRepository.findAll();
	}
	public void registrarEspecialidad(EspecialidadClass especialidad) {
		especialidadRepository.save(especialidad);
	}
}
