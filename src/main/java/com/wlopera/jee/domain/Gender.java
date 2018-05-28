package com.wlopera.jee.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name = "Gender.findAll", query = "SELECT g FROM Gender g ORDER BY g.idGender")})
@Table(name = "gender")
public class Gender implements Serializable {

	private static final long serialVersionUID = 6225152186321583385L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_gender")
	private Integer idGender;
	
	@Column(name = "name", nullable = false, length = 45)
	private String name;
	
	@Column(nullable = false, length = 45)
	private String description;
	
	public Gender() {}
	
	public Gender(Integer idGender, String name, String description) {
		this.idGender = idGender;
		this.name = name;
		this.description = description;
	}
	
	public Integer getIdGender() {
		return idGender;
	}
	public void setIdGender(Integer idGender) {
		this.idGender = idGender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Gender [idGener=" + idGender + ", name=" + name + ", description=" + description + "]";
	}

}
