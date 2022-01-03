package bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="equipements")
public class Equipement {
	
	@Id @Column (name="id_equipement")
	private Integer id;
	private String nom;
	private Float prix;
	private Boolean reserve;
	public Equipement() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Float getPrix() {
		return prix;
	}
	public void setPrix(Float prix) {
		this.prix = prix;
	}
	public Boolean getReserve() {
		return reserve;
	}
	public void setReserve(Boolean reserve) {
		this.reserve = reserve;
	}
	@Override
	public String toString() {
		return "Equipement [id=" + id + ", nom=" + nom + ", prix=" + prix + ", reserve=" + reserve + "]";
	}
	
	

}
