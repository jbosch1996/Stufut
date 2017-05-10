/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Carta;
import entities.Mazo;
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

    // validar usuario 
    // recibe 2 string, user y pass
    // trae al usuario por nombre de usua
    // si el usuario q trae es null devuelve falso
    // sino comparas pass con el pass del usuario
    // si es correcto true y sino false
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
}
