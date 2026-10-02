package cr.ac.ucr.ie.Laboratorio01.domain;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
@Table(name = "peliculas")

public class Pelicula {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "Titulo", unique = true, nullable=false)
    private String titulo;

    @Column(name = "titulo_original")
    private String tituloOriginal;

    @Column(columnDefinition = "TEXT")
    private String sinopsis;
    
    @Column(nullable = false)
    private Integer duracion;

    @Column(name = "fecha_estreno",nullable = false)
    private LocalDate fechaEstreno;
    @Column(nullable = false)
    private String clasificacion;
    @Column(nullable = false)
    private String genero;
    private String director;
    private String idioma;
    private String pais;
    private String afiche;
    private Boolean activo;

    public Pelicula() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAfiche() {
        return afiche;
    }

    public void setAfiche(String afiche) {
        this.afiche = afiche;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

   
}
