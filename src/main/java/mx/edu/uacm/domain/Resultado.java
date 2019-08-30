package mx.edu.uacm.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Resultado {
	@OneToOne
	
	private Usuario usuario;
	
	@OneToOne
	private Cuestionario cuestionario;
	
}
