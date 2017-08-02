package fr.adaming.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_c")
	private int idClient;
	@Column(name = "nom_c")
	private String nomClient;
	@Column(name = "adresse_c")
	private String adresse;
	@Column(name = "email_c")
	private String email;
	@Column(name = "tel_c")
	private String tel;

public client() {
super();
// TODO Auto-generated constructor stub
}

public client(int idClient, String nomClient, String adresse, String email, String tel) {
super();
this.idClient = idClient;
this.nomClient = nomClient;
this.adresse = adresse;
this.email = email;
this.tel = tel;
}

public client(String nomClient, String adresse, String email, String tel) {
super();
this.nomClient = nomClient;
this.adresse = adresse;
this.email = email;
this.tel = tel;
}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}}

	Marc Bodard
Ingénieur Agroalimentaire
	Supply chain ISARA-Lyon

}
