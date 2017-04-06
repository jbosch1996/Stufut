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
@Table(name = "stufut_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StufutUsuario.findAll", query = "SELECT s FROM StufutUsuario s"),
    @NamedQuery(name = "StufutUsuario.findByNombreusu", query = "SELECT s FROM StufutUsuario s WHERE s.nombreusu = :nombreusu"),
    @NamedQuery(name = "StufutUsuario.findByEmail", query = "SELECT s FROM StufutUsuario s WHERE s.email = :email"),
    @NamedQuery(name = "StufutUsuario.findByNombre", query = "SELECT s FROM StufutUsuario s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "StufutUsuario.findByApellido", query = "SELECT s FROM StufutUsuario s WHERE s.apellido = :apellido"),
    @NamedQuery(name = "StufutUsuario.findByPass", query = "SELECT s FROM StufutUsuario s WHERE s.pass = :pass")})
public class StufutUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombreusu")
    private String nombreusu;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "email")
    private String email;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 20)
    @Column(name = "pass")
    private String pass;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nombreusu")
    private Collection<ComentariosCartaUsuario> comentariosCartaUsuarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nombreusu")
    private Collection<Mazo> mazoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nombreusu")
    private Collection<ComentariosMazo> comentariosMazoCollection;

    public StufutUsuario() {
    }

    public StufutUsuario(String nombreusu) {
        this.nombreusu = nombreusu;
    }

    public String getNombreusu() {
        return nombreusu;
    }

    public void setNombreusu(String nombreusu) {
        this.nombreusu = nombreusu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @XmlTransient
    public Collection<ComentariosCartaUsuario> getComentariosCartaUsuarioCollection() {
        return comentariosCartaUsuarioCollection;
    }

    public void setComentariosCartaUsuarioCollection(Collection<ComentariosCartaUsuario> comentariosCartaUsuarioCollection) {
        this.comentariosCartaUsuarioCollection = comentariosCartaUsuarioCollection;
    }

    @XmlTransient
    public Collection<Mazo> getMazoCollection() {
        return mazoCollection;
    }

    public void setMazoCollection(Collection<Mazo> mazoCollection) {
        this.mazoCollection = mazoCollection;
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
        hash += (nombreusu != null ? nombreusu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StufutUsuario)) {
            return false;
        }
        StufutUsuario other = (StufutUsuario) object;
        if ((this.nombreusu == null && other.nombreusu != null) || (this.nombreusu != null && !this.nombreusu.equals(other.nombreusu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.StufutUsuario[ nombreusu=" + nombreusu + " ]";
    }
    
}
