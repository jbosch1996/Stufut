/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 53298857Z
 */
@Entity
@Table(name = "carta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carta.findAll", query = "SELECT c FROM Carta c"),
    @NamedQuery(name = "Carta.findByIdcarta", query = "SELECT c FROM Carta c WHERE c.idcarta = :idcarta"),
    @NamedQuery(name = "Carta.findByNombre", query = "SELECT c FROM Carta c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Carta.findByMedia", query = "SELECT c FROM Carta c WHERE c.media = :media"),
    @NamedQuery(name = "Carta.findByPosicion", query = "SELECT c FROM Carta c WHERE c.posicion = :posicion"),
    @NamedQuery(name = "Carta.findByEquipo", query = "SELECT c FROM Carta c WHERE c.equipo = :equipo"),
    @NamedQuery(name = "Carta.findByPais", query = "SELECT c FROM Carta c WHERE c.pais = :pais"),
    @NamedQuery(name = "Carta.findByVelocidad", query = "SELECT c FROM Carta c WHERE c.velocidad = :velocidad"),
    @NamedQuery(name = "Carta.findByDisparo", query = "SELECT c FROM Carta c WHERE c.disparo = :disparo"),
    @NamedQuery(name = "Carta.findByPase", query = "SELECT c FROM Carta c WHERE c.pase = :pase"),
    @NamedQuery(name = "Carta.findByRegate", query = "SELECT c FROM Carta c WHERE c.regate = :regate"),
    @NamedQuery(name = "Carta.findByDefensa", query = "SELECT c FROM Carta c WHERE c.defensa = :defensa"),
    @NamedQuery(name = "Carta.findByFisico", query = "SELECT c FROM Carta c WHERE c.fisico = :fisico"),
    @NamedQuery(name = "Carta.findByTipo", query = "SELECT c FROM Carta c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Carta.findByLikes", query = "SELECT c FROM Carta c WHERE c.likes = :likes"),
    @NamedQuery(name = "Carta.findByDislikes", query = "SELECT c FROM Carta c WHERE c.dislikes = :dislikes")})
public class Carta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcarta")
    private Integer idcarta;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "media")
    private Integer media;
    @Size(max = 20)
    @Column(name = "posicion")
    private String posicion;
    @Size(max = 20)
    @Column(name = "equipo")
    private String equipo;
    @Size(max = 20)
    @Column(name = "pais")
    private String pais;
    @Column(name = "velocidad")
    private Integer velocidad;
    @Column(name = "disparo")
    private Integer disparo;
    @Column(name = "pase")
    private Integer pase;
    @Column(name = "regate")
    private Integer regate;
    @Column(name = "defensa")
    private Integer defensa;
    @Column(name = "fisico")
    private Integer fisico;
    @Size(max = 20)
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "likes")
    private Integer likes;
    @Column(name = "dislikes")
    private Integer dislikes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcarta")
    private Collection<ComentariosCartaUsuario> comentariosCartaUsuarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcarta")
    private Collection<MazoCarta> mazoCartaCollection;

    public Carta() {
    }

    public Carta(Integer idcarta) {
        this.idcarta = idcarta;
    }

    public Carta(Integer idcarta,String nombre, Integer media, String posicion, String equipo, String pais, Integer velocidad, Integer disparo, Integer pase, Integer regate, Integer defensa, Integer fisico, String tipo, Integer likes, Integer dislikes) {
        this.idcarta = 0;
        this.nombre = nombre;
        this.media = media;
        this.posicion = posicion;
        this.equipo = equipo;
        this.pais = pais;
        this.velocidad = velocidad;
        this.disparo = disparo;
        this.pase = pase;
        this.regate = regate;
        this.defensa = defensa;
        this.fisico = fisico;
        this.tipo = tipo;
        this.likes = likes;
        this.dislikes = dislikes;
    }
    public Integer getIdcarta() {
        return idcarta;
    }

    public void setIdcarta(Integer idcarta) {
        this.idcarta = idcarta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getMedia() {
        return media;
    }

    public void setMedia(Integer media) {
        this.media = media;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getDisparo() {
        return disparo;
    }

    public void setDisparo(Integer disparo) {
        this.disparo = disparo;
    }

    public Integer getPase() {
        return pase;
    }

    public void setPase(Integer pase) {
        this.pase = pase;
    }

    public Integer getRegate() {
        return regate;
    }

    public void setRegate(Integer regate) {
        this.regate = regate;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    public Integer getFisico() {
        return fisico;
    }

    public void setFisico(Integer fisico) {
        this.fisico = fisico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    @XmlTransient
    public Collection<ComentariosCartaUsuario> getComentariosCartaUsuarioCollection() {
        return comentariosCartaUsuarioCollection;
    }

    public void setComentariosCartaUsuarioCollection(Collection<ComentariosCartaUsuario> comentariosCartaUsuarioCollection) {
        this.comentariosCartaUsuarioCollection = comentariosCartaUsuarioCollection;
    }

    @XmlTransient
    public Collection<MazoCarta> getMazoCartaCollection() {
        return mazoCartaCollection;
    }

    public void setMazoCartaCollection(Collection<MazoCarta> mazoCartaCollection) {
        this.mazoCartaCollection = mazoCartaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcarta != null ? idcarta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carta)) {
            return false;
        }
        Carta other = (Carta) object;
        if ((this.idcarta == null && other.idcarta != null) || (this.idcarta != null && !this.idcarta.equals(other.idcarta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Carta[ idcarta=" + idcarta + " ]";
    }

}
