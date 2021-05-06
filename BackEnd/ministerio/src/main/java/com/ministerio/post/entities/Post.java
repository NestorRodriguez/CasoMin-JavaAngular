package com.ministerio.post.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "POST")
public class Post implements Serializable {

	/**
	 * CONSTANTES
	 */
	private static final long serialVersionUID = 1L;

	// --------------------------------
	// Atributos de la clase.
	// --------------------------------

	/**
	 * Identificador de la entidad
	 */
	private int id;

	/**
	 * Titulo del post
	 */
	private String titulo;

	/**
	 * Descripción de la publicación
	 */
	private String descripcion;

	/**
	 * Usuario de la publicación
	 */
	private Usuario usuario;

	// --------------------------------
	// Constructor de la clase.
	// --------------------------------

	/**
	 * Constructor
	 */
	public Post() {
	}

	/**
	 * @param id
	 * @param titulo
	 * @param descripcion
	 */
	public Post(int id, String titulo, String descripcion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}

	/**
	 * @return id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_POST_PK", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return titulo
	 */
	@Column(name = "TITULO", nullable = false)
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return
	 */
	@Column(name = "DESCRIPCION", nullable = false)
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return usuario
	 */
	@ManyToOne( fetch = FetchType.EAGER )
	@JoinColumn(name = "ID_USUARIO_FK", nullable = false)
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", usuario=" + usuario + "]";
	}
	
	
}
