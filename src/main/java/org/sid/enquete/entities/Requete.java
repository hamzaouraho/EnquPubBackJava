package org.sid.enquete.entities;

import java.util.Collection;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="Requete")

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Requete {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	@Column(length = 75)
	private String nom;
	@Column(length = 75)
	private String tf;
	@Column(length = 75)
	private String cin;
	private String commentaire;
	@Column(columnDefinition = "longtext")
	private String situation;
	@Column(columnDefinition = "longtext")
	private String image;
	private int etude_id;
	//@ManyToOne(fetch=FetchType.LAZY)  
	//private Etude etude;
}
