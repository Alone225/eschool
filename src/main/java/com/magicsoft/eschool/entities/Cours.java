package com.magicsoft.eschool.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Time;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cours implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_cours;
	private String libelle_cours;
	@Temporal(value = TemporalType.DATE)
	private Date datedebut;
	@Temporal(value = TemporalType.DATE)
	private Date datefin;
	private Integer effectif;
	@OneToMany(mappedBy = "cours")
	private List<Activite> activites;
	@OneToMany(mappedBy = "cours")
	private List<Dossier> dossiers;
	


}
