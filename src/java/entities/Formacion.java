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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 53298857Z
 */
@Entity
@Table(name = "formacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formacion.findAll", query = "SELECT f FROM Formacion f"),
    @NamedQuery(name = "Formacion.findByIdformacion", query = "SELECT f FROM Formacion f WHERE f.idformacion = :idformacion"),
    @NamedQuery(name = "Formacion.findByTipo", query = "SELECT f FROM Formacion f WHERE f.tipo = :tipo")})
public class Formacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idformacion")
    private Integer idformacion;
    @Size(max = 20)
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idformacion")
    private Collection<Mazo> mazoCollection;

    public Formacion() {
    }

    public Formacion(Integer idformacion) {
        this.idformacion = idformacion;
    }

    public Integer getIdformacion() {
        return idformacion;
    }

    public void setIdformacion(Integer idformacion) {
        this.idformacion = idformacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public Collection<Mazo> getMazoCollection() {
        return mazoCollection;
    }

    public void setMazoCollection(Collection<Mazo> mazoCollection) {
        this.mazoCollection = mazoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idformacion != null ? idformacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formacion)) {
            return false;
        }
        Formacion other = (Formacion) object;
        if ((this.idformacion == null && other.idformacion != null) || (this.idformacion != null && !this.idformacion.equals(other.idformacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Formacion[ idformacion=" + idformacion + " ]";
    }
    
}
