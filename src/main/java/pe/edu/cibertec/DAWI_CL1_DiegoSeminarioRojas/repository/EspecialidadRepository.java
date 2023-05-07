package pe.edu.cibertec.DAWI_CL1_DiegoSeminarioRojas.repository;

import org.springframework.stereotype.Repository;


import pe.edu.cibertec.DAWI_CL1_DiegoSeminarioRojas.model.EspecialidadClass;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface EspecialidadRepository extends JpaRepository<EspecialidadClass,String>{

}
