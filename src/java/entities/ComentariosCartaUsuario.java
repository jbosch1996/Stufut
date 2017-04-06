/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 53298857Z
 */
@Entity
@Table(name = "comentarios_carta_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComentariosCartaUsuario.findAll", query = "SELECT c FROM ComentariosCartaUsuario c"),
    @NamedQuery(name = "ComentariosCartaUsuario.findByIdcomentario", query = "SELECT c FROM ComentariosCartaUsuario c WHERE c.idcomentario = :idcomentario"),
    @NamedQuery(name = "ComentariosCartaUsuario.findByFecha", query = "SELECT c FROM ComentariosCartaUsuario c WHERE c.fecha = :fecha")})
public class ComentariosCartaUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcomentario")
    private Integer idcomentario;
    @Lob
    @Size(max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "nombreusu", referencedColumnName = "nombreusu")
    @ManyToOne(optional = false)
    private StufutUsuario nombreusu;
    @JoinColumn(name = "idcarta", referencedColumnName = "idcarta")
    @ManyToOne(optional = false)
    private Carta idcarta;

    public ComentariosCartaUsuario() {
    }

    public ComentariosCartaUsuario(Integer idcomentario) {
        this.idcomentario = idcomentario;
    }

    public Integer getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(Integer idcomentario) {
        this.idcomentario = idcomentario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public StufutUsuario getNombreusu() {
        return nombreusu;
    }

    public void setNombreusu(StufutUsuario nombreusu) {
        this.nombreusu = nombreusu;
    }

    public Carta getIdcarta() {
        return idcarta;
    }

    public void setIdcarta(Carta idcarta) {
        this.idcarta = idcarta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomentario != null ? idcomentario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComentariosCartaUsuario)) {
            return false;
        }
        ComentariosCartaUsuario other = (ComentariosCartaUsuario) object;
        if ((this.idcomentario == null && other.idcomentario != null) || (this.idcomentario != null && !this.idcomentario.equals(other.idcomentario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ComentariosCartaUsuario[ idcomentario=" + idcomentario + " ]";
    }
    
}
