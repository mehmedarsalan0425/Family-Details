package edu.mehmed.family.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.mehmed.family.entity.FamilyEntity;

@Component
public class Repository {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveFamilyDetails(FamilyEntity entity) {
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.merge(entity);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
	
	public List<FamilyEntity> findAllFamilyDetails()
	{
		Session session = sessionFactory.openSession();
		String query = "from FamilyEntity";
		Query createQuery = session.createQuery(query);
		return createQuery.list();
		
		
		
		
		
	}
}
