package com.placement.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.placement.entities.College;


public class CollegeDaoImpl implements CollegeDao {
	EntityManager em;
	public CollegeDaoImpl()
	{
		em=Configuration.getEntityManager();
	}
	
	@Override
	public void addCollege(College c) {
		em.persist(c);		
	}

	@Override
	public College getCollege(int id) {
		College c=em.find(College.class, id);
		return c;
	}

	@Override
	public void updateCollege(College c) {
		em.merge(c);
		
	}

	@Override
	public void deleteCollege(int id) {
		College c=getCollege(id);
		em.remove(c);
		
	}
	

	@Override
	public void startTransaction() {
		em.getTransaction().begin();		
	}

	@Override
	public void endTransaction() {
		em.getTransaction().commit();		
	}

	@Override
	public College getCollegeById(int id) {
		String query="select b from College b where b.id like: id";
		TypedQuery<College> t=em.createQuery(query,College.class);
		t.setParameter("id",id);
		return t.getSingleResult();
		
	}

}
