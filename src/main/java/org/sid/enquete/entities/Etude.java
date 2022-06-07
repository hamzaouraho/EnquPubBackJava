package org.sid.enquete.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor 
public class Etude implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String titre;
	@Column(length = 75)
	private String typeDoc;
	private String intitule;
	@Column(length = 75)
	private String dateDebut;
	@Column(length = 175)
	private String commune;
	@Column(length = 175)
	private String agenceUrba;
	private String pictureUrl;
	@Column(columnDefinition = "longtext")
	private String perimetre; 
	@OneToMany(mappedBy = "etude")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Collection<Requete> requetes; 

}
