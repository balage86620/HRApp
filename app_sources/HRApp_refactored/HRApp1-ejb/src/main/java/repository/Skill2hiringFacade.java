/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import model.Skill2hiring;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lkg
 */
@Stateless
public class Skill2hiringFacade extends AbstractFacade<Skill2hiring> {

    @PersistenceContext(unitName = "hu.evosoft_HRApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Skill2hiringFacade() {
        super(Skill2hiring.class);
    }
    
}
