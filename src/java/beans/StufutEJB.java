/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Carta;
import entities.StufutUsuario;
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

    public boolean existUser(StufutUsuario u) {
        EntityManager em = emf.createEntityManager();
        StufutUsuario encontrada = em.find(StufutUsuario.class, u.getEmail());
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
        Carta encontrado = em.find(Carta.class, c.getNombre());
        em.close();
        return encontrado != null;
    }
    
    
}
