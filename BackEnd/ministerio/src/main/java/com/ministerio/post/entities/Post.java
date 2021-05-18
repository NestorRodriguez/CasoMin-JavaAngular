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

@NamedQueries(value = {
		@NamedQuery(name = "Post.findPostByIdUsuario", query = "SELECT p FROM Post p WHERE p.usuario.id = :id"),
		@NamedQuery(name = "Post.findPostShared", query = "SELECT p FROM Post p WHERE p.compartir = :estado")})
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
	private long id;

	/**
	 * Titulo del post
	 */
	private String titulo;

	/**
	 * Descripción de la publicación
	 */
	private String descripcion;
	
	/**
	 * Compatir la publicación
	 */
	private boolean compartir;

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
	 * @param compartir
	 * @param usuario
	 */
	public Post(long id, String titulo, String descripcion, boolean compartir, Usuario usuario) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.compartir = compartir;
		this.usuario = usuario;
	}

	/**
	 * @return id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_POST_PK", nullable = false)
	public long getId() {
		return id;
	}

	public void setId(long id) {
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
	 * @return compartir
	 */
	@Column(name = "COMPARTIR", nullable = false)
	public boolean isCompartir() {
		return compartir;
	}

	public void setCompartir(boolean compartir) {
		this.compartir = compartir;
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
		return "Post [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", compartir=" + compartir
				+ ", usuario=" + usuario + "]";
	}
	
}
