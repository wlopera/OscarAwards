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
    @NamedQuery(name = "Oscar.findAll", query = "SELECT o FROM Oscar o ORDER BY o.idOscar")})
@Table(name = "oscar")
public class Oscar implements Serializable {

	private static final long serialVersionUID = -4721316713564624259L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_oscar")
	private Integer idOscar;
	
	@Column(name = "year", nullable = false)
	private Integer year;

	@Column(name = "edition", nullable = false)
	private Integer edition;

	@Column(name = "name", nullable = false, length = 45)
	private String name;

	@Column(name = "awards", nullable = false)
	private Integer awards;

	@Column(name = "nominations", nullable = false)
	private Integer nominations;

	@Column(name = "id_gender", nullable = false)
	private Integer idGender;

	@Column(name = "description", nullable = false, length = 45)
	private String description;

	public Oscar() {}
	
	public Oscar(Integer idOscar, Integer year, Integer edition, String name, Integer awards, Integer nominations,
			Integer idGender, String description) {
		super();
		this.idOscar = idOscar;
		this.year = year;
		this.edition = edition;
		this.name = name;
		this.awards = awards;
		this.nominations = nominations;
		this.idGender = idGender;
		this.description = description;
	}

	public Integer getIdOscar() {
		return idOscar;
	}

	public void setIdOscar(Integer idOscar) {
		this.idOscar = idOscar;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getEdition() {
		return edition;
	}

	public void setEdition(Integer edition) {
		this.edition = edition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAwards() {
		return awards;
	}

	public void setAwards(Integer awards) {
		this.awards = awards;
	}

	public Integer getNominations() {
		return nominations;
	}

	public void setNominations(Integer nominations) {
		this.nominations = nominations;
	}

	public Integer getIdGender() {
		return idGender;
	}

	public void setIdGender(Integer idGender) {
		this.idGender = idGender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Oscar [idOscar=" + idOscar + ", year=" + year + ", edition=" + edition + ", name=" + name + ", awards="
				+ awards + ", nominations=" + nominations + ", idGender=" + idGender + ", description=" + description
				+ "]";
	}
	
}
