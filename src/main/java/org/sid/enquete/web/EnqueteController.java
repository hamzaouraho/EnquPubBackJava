package org.sid.enquete.web;

import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.transaction.Transactional;

import org.sid.enquete.dao.EtudeRepository;
import org.sid.enquete.dao.RequeteRepository;
import org.sid.enquete.entities.Etude;
import org.sid.enquete.entities.Requete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@Transactional
public class EnqueteController {
	@Autowired
	private EtudeRepository etudeRepository;
	@Autowired
	private RequeteRepository requeteRepository;
	@CrossOrigin(origins = "http://localhost:3000/")
	@GetMapping("/etudes")
	public List<Etude> etudes(){
		return etudeRepository.findAll();
	}
	@CrossOrigin(origins = "http://localhost:3000/")
	@GetMapping("/etudes/{id}")
	public List<Etude> etudesById(@PathVariable (name="id") Long id){
		return etudeRepository.chercher(id);
	}
	@CrossOrigin(origins = "http://localhost:3000/")
	@GetMapping("/visualiser/{id}")
	public List<Etude> visualiserById(@PathVariable (name="id") Long id){
		return etudeRepository.visualiser(id);
	}
	@CrossOrigin(origins = "http://localhost:3000/")
	@GetMapping("/situations/{id}")
	public List<Requete> situationsById(@PathVariable (name="id") int id){
		return requeteRepository.situationsById(id);
	}
	@CrossOrigin(origins = "http://localhost:3000/")
	@GetMapping("/situations")
	public List<Requete> situations(){
		return requeteRepository.situations();
	}
	@CrossOrigin(origins = "http://localhost:3000/")
	@PostMapping(value = "/createRequete")
	public Requete createRequete(@RequestBody Requete requete) {
		requeteRepository.save(requete);
		return requete;
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(value = "/createEtude")
	public Etude createEtude(@RequestBody Etude etude) {
		System.out.println(etude);
		etudeRepository.save(etude);
		return etude;
	}
}


























