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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 53298857Z
 */
@Entity
@Table(name = "mazo_carta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MazoCarta.findAll", query = "SELECT m FROM MazoCarta m"),
    @NamedQuery(name = "MazoCarta.findByIdmazocarta", query = "SELECT m FROM MazoCarta m WHERE m.idmazocarta = :idmazocarta"),
    @NamedQuery(name = "MazoCarta.findByFechamazocarta", query = "SELECT m FROM MazoCarta m WHERE m.fechamazocarta = :fechamazocarta")})
public class MazoCarta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmazocarta")
    private Integer idmazocarta;
    @Column(name = "fechamazocarta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechamazocarta;
    @JoinColumn(name = "idcarta", referencedColumnName = "idcarta")
    @ManyToOne(optional = false)
    private Carta idcarta;
    @JoinColumn(name = "idmazo", referencedColumnName = "idmazo")
    @ManyToOne(optional = false)
    private Mazo idmazo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmazo")
    private Collection<ComentariosMazo> comentariosMazoCollection;

    public MazoCarta() {
    }

    public MazoCarta(Integer idmazocarta) {
        this.idmazocarta = idmazocarta;
    }

    public Integer getIdmazocarta() {
        return idmazocarta;
    }

    public void setIdmazocarta(Integer idmazocarta) {
        this.idmazocarta = idmazocarta;
    }

    public Date getFechamazocarta() {
        return fechamazocarta;
    }

    public void setFechamazocarta(Date fechamazocarta) {
        this.fechamazocarta = fechamazocarta;
    }

    public Carta getIdcarta() {
        return idcarta;
    }

    public void setIdcarta(Carta idcarta) {
        this.idcarta = idcarta;
    }

    public Mazo getIdmazo() {
        return idmazo;
    }

    public void setIdmazo(Mazo idmazo) {
        this.idmazo = idmazo;
    }

    @XmlTransient
    public Collection<ComentariosMazo> getComentariosMazoCollection() {
        return comentariosMazoCollection;
    }

    public void setComentariosMazoCollection(Collection<ComentariosMazo> comentariosMazoCollection) {
        this.comentariosMazoCollection = comentariosMazoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmazocarta != null ? idmazocarta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MazoCarta)) {
            return false;
        }
        MazoCarta other = (MazoCarta) object;
        if ((this.idmazocarta == null && other.idmazocarta != null) || (this.idmazocarta != null && !this.idmazocarta.equals(other.idmazocarta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.MazoCarta[ idmazocarta=" + idmazocarta + " ]";
    }
    
}
