package com.ministerio.post.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(value = { @NamedQuery(name = "Rol.findAllRol", query = "SELECT r FROM Rol r"),
		@NamedQuery(name = "Rol.findRolById", query = "SELECT r FROM Rol r WHERE r.id = :idRol"),
		@NamedQuery(name = "Rol.findAllRolesByEstado", query = "SELECT r FROM Rol r")

})

@Entity
@Table(name = "ROL")
public class Rol implements Serializable {

	// --------------------------------
	// Constantes de la Clase.
	// --------------------------------

	/**
	 * Constante de Serializaci�n.
	 */
	private static final long serialVersionUID = -6362794385792247263L;

	// --------------------------------
	// Atributos de la Clase.
	// --------------------------------

	/**
	 * Identificador del Rol.
	 */
	private int id;

	/**
	 * Descripci�n del rol
	 */
	private String descripcion;
	
	// --------------------------------
	// Constructor de la Clase.
	// --------------------------------

	/**
	 * Constructor por Defecto.
	 */
	public Rol() {
	}

	// --------------------------------
	// M�todos de la Clase.
	// --------------------------------

	/**
	 * @return the idRol
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ROL_PK", nullable = false)
	public int getId() {
		return id;
	}

	/**
	 * @param idRol the idRol to set
	 */
	public void setId(int idRol) {
		this.id = idRol;
	}

	/**
	 * @return the descripcion
	 */
	@Column(name = "DESCRIPCION", nullable = false)
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rol [id=" + id + ", descripcion=" + descripcion + "]";
	}

}
