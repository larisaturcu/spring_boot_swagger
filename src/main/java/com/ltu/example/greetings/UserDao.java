package com.ltu.example.greetings;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.ltu.example.greetings.model.User;

@Repository
public class UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	public List getUserDetails() {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(User.class);
		return criteria.list();
	}

}
