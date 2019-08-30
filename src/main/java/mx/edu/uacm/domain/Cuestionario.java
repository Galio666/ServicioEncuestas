package mx.edu.uacm.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Cuestionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String categoria;
	private int numeroPreguntas;

	@OneToMany()
	@JoinColumn(name = "id_pregunta")
	private List<Pregunta> pregunta = new ArrayList<>();

}
