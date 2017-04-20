/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

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

    public boolean existUSer(StufutUsuario u) {
        EntityManager em = emf.createEntityManager();
        StufutUsuario encontrada = em.find(StufutUsuario.class, u.getEmail());
        em.close();
        return encontrada != null;
    }

    public boolean altaUser(StufutUsuario u) {
        if (!existUSer(u)) {
            EntityManager em = emf.createEntityManager();
            em.persist(u);
            em.close();
            return true;
        }
        return false;
    }

}
