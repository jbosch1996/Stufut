/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Carta;
import entities.Formacion;
import entities.Mazo;
import entities.MazoCarta;
import entities.StufutUsuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author 53298857Z
 */
@Stateless
public class StufutEJB {

    @PersistenceUnit
    EntityManagerFactory emf;

    public boolean loginUser(String nombreusu, String pass) {
        EntityManager em = emf.createEntityManager();
        StufutUsuario encontrada = em.find(StufutUsuario.class, nombreusu);
        if (encontrada != null) {
            if (pass.equals(encontrada.getPass())) {
                return true;
            }
        }
        em.close();
        return false;
    }

    public boolean existUser(StufutUsuario u) {
        EntityManager em = emf.createEntityManager();
        StufutUsuario encontrada = em.find(StufutUsuario.class, u.getNombreusu());
        em.close();
        return encontrada != null;
    }

    public boolean altaUser(StufutUsuario u) {
        if (!existUser(u)) {
            EntityManager em = emf.createEntityManager();
            em.persist(u);
            em.close();
            return true;
        }
        return false;
    }

    public boolean insertCarta(Carta c) {
        if (!existCarta(c)) {
            EntityManager em = emf.createEntityManager();
            em.persist(c);
//        em.flush();   Para forzar que se haga ahora
            em.close();
            return true;
        }
        return false;
    }

    public boolean insertMazo(Mazo m) {
        if (!existMazo(m)) {
            EntityManager em = emf.createEntityManager();
            em.persist(m);
            em.close();
            return true;
        }
        return false;
    }

    public boolean existMazo(Mazo m) {
        EntityManager em = emf.createEntityManager();
//        Carta encontrado = em.find(Carta.class, c.getNombre());
        List<Mazo> mazos = em.createNamedQuery("Carta.findByNombre").setParameter("nombre", m.getNombre()).getResultList();
        em.close();
        return !mazos.isEmpty();
    }

    public boolean existCarta(Carta c) {
        EntityManager em = emf.createEntityManager();
//        Carta encontrado = em.find(Carta.class, c.getNombre());
        List<Carta> cartas = em.createNamedQuery("Carta.findByNombre").setParameter("nombre", c.getNombre()).getResultList();
        em.close();
        return !cartas.isEmpty();
    }

    public List<Carta> selectAllCarta() {
        return emf.createEntityManager().createNamedQuery("Carta.findAll").getResultList();
    }

    public List<Mazo> selectAllMazo() {
        return emf.createEntityManager().createNamedQuery("Mazo.findAll").getResultList();
    }
    
    public List<MazoCarta> selectAllMazoCartaByIdmazo(Integer id) {
        return emf.createEntityManager().createNamedQuery("MazoCarta.findByIdmazo").setParameter("idmazo", id).getResultList();
    }
    

    public List<Formacion> selectAllFormaciones() {
        return emf.createEntityManager().createNamedQuery("Formacion.findAll").getResultList();
    }

    public StufutUsuario selectStufutUsuarioByName(String s) {
        return emf.createEntityManager().find(StufutUsuario.class, s);
    }

    public Mazo selectMazoByIdmazo(Integer idmazo) {
        return emf.createEntityManager().find(Mazo.class, idmazo);
    }

    public Formacion selectFormacionByIdformacion(Integer id) {
        return emf.createEntityManager().find(Formacion.class, id);
    }

    public Carta selectCartaById(Integer id) {
        return emf.createEntityManager().find(Carta.class, id);
    }

    public boolean removeCarta(Carta c) {
        EntityManager em = emf.createEntityManager();
        Carta aux = em.find(Carta.class, c.getIdcarta());
        if (aux != null) {
            em.remove(aux);
            em.close();
            return true;
        }
        return false;
    }

    public List<Carta> selectAllCartas() {
        return emf.createEntityManager().createNamedQuery("Carta.findAll").getResultList();
    }

    public boolean insertMazoCarta(MazoCarta m) {

        EntityManager em = emf.createEntityManager();
        em.persist(m);
        em.close();
        return true;

    }

}
