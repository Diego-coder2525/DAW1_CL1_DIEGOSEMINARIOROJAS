package pe.edu.cibertec.DAWI_CL1_DiegoSeminarioRojas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "especialidad")
public class EspecialidadClass {
	@Id
	private String idEsp;
	@Column(name="NomEsp")
	private String nomEsp;
	@Column(name = "Costo")
	private float costo;
}
