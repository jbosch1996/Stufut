/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 53298857Z
 */
@Entity
@Table(name = "mazo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mazo.findAll", query = "SELECT m FROM Mazo m"),
    @NamedQuery(name = "Mazo.findByIdmazo", query = "SELECT m FROM Mazo m WHERE m.idmazo = :idmazo"),
    @NamedQuery(name = "Mazo.findByNombre", query = "SELECT m FROM Mazo m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Mazo.findByLikes", query = "SELECT m FROM Mazo m WHERE m.likes = :likes"),
    @NamedQuery(name = "Mazo.findByFecha", query = "SELECT m FROM Mazo m WHERE m.fecha = :fecha")})
public class Mazo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmazo")
    private Integer idmazo;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "likes")
    private Integer likes;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmazo")
    private Collection<MazoCarta> mazoCartaCollection;
    @JoinColumn(name = "idformacion", referencedColumnName = "idformacion")
    @ManyToOne(optional = false)
    private Formacion idformacion;
    @JoinColumn(name = "nombreusu", referencedColumnName = "nombreusu")
    @ManyToOne(optional = false)
    private StufutUsuario nombreusu;

    public Mazo() {
    }

    public Mazo(Integer idmazo, String nombre, Integer likes, StufutUsuario nombreusu, Formacion idformacion) {
        this.idmazo = 0;
        this.nombre = nombre;
        this.likes = likes;
        this.nombreusu = nombreusu;
        this.idformacion = idformacion;
    }

    
    
    public Mazo(Integer idmazo) {
        this.idmazo = idmazo;
    }

    public Integer getIdmazo() {
        return idmazo;
    }

    public void setIdmazo(Integer idmazo) {
        this.idmazo = idmazo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public Collection<MazoCarta> getMazoCartaCollection() {
        return mazoCartaCollection;
    }

    public void setMazoCartaCollection(Collection<MazoCarta> mazoCartaCollection) {
        this.mazoCartaCollection = mazoCartaCollection;
    }

    public Formacion getIdformacion() {
        return idformacion;
    }

    public void setIdformacion(Formacion idformacion) {
        this.idformacion = idformacion;
    }

    public StufutUsuario getNombreusu() {
        return nombreusu;
    }

    public void setNombreusu(StufutUsuario nombreusu) {
        this.nombreusu = nombreusu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmazo != null ? idmazo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mazo)) {
            return false;
        }
        Mazo other = (Mazo) object;
        if ((this.idmazo == null && other.idmazo != null) || (this.idmazo != null && !this.idmazo.equals(other.idmazo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mazo[ idmazo=" + idmazo + " ]";
    }
    
}
