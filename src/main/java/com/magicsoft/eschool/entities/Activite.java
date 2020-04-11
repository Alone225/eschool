package com.magicsoft.eschool.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activite implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_activite;
	private String libelle_activite;
	private Long noteactivite;
	@ManyToMany
	@JoinColumn(name = "id_cours")
	private Cours cours;
	@ManyToOne
	@JoinColumn(name = "id_typeactivite")
	private TypeActivite typeactivite;


}
