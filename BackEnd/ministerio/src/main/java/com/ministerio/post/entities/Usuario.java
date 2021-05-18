package com.ministerio.post.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@NamedQueries(value = {
		@NamedQuery(name = "Usuario.findUsuarioByMail", query = "SELECT c FROM Usuario c WHERE c.mail = :mail"),
		@NamedQuery(name = "Usuario.findAllUsuario", query = "SELECT c FROM Usuario c"),
		@NamedQuery(name = "Usuario.findUsuarioByUserName", query = "SELECT u FROM Usuario u WHERE u.mail = :mail and u.password = :password"),
		@NamedQuery(name = "Usuario.findUsuariosByRol", query = "SELECT u FROM Usuario u WHERE u.rol.id = :idRol") })
@Entity
@Table(name = "USUARIOS")
public class Usuario implements Serializable {

	// --------------------------------
	// Constantes de la clase.
	// --------------------------------

	/**
	 * Constante de serializaci�n.
	 */
	private static final long serialVersionUID = 1265660971450473499L;

	// --------------------------------
	// Atributos de la clase.
	// --------------------------------

	/**
	 * Identificador de la entidad UsuarioBO
	 */
	private int id;

	/**
	 * Numero de documento de la persona
	 */
	private String password;

	/**
	 * Nombre de la persona
	 */
	private String nombre;

	/**
	 * Email de la persona
	 */
	private String mail;

	/**
	 * Estado del usuario
	 */
	private boolean estado;

	/**
	 * RolBO al que pertenece este usuario
	 */
	private Rol rol;

	// --------------------------------
	// Constructor de la clase.
	// --------------------------------

	/**
	 * Constructor por defecto.
	 */
	public Usuario() {

	}

	// --------------------------------
	// Metodos de la clase.
	// --------------------------------

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO_PK", nullable = false)
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the nombre
	 */
	@Column(name = "NOMBRE", nullable = false)
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the mail
	 */
	@Column(name = "EMAIL", nullable = false , unique=true)
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the rol
	 */
	@OneToOne
	@JoinColumn(name = "ID_ROL_FK", nullable = false)
	public Rol getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(Rol rol) {
		this.rol = rol;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UsuarioBO [id=" + id + ", password=" + password + ", nombre=" + nombre
				+ ", mail=" + mail + ", rol=" + rol + "]";
	}

}
