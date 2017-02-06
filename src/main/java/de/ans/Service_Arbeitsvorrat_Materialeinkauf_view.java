package de.ans;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_Arbeitsvorrat_Materialeinkauf_view {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<?> getWorkList(){
		Session s = sessionFactory.getCurrentSession();
		System.out.println(s);
		
		Criteria cr = s.createCriteria(Arbeitsvorrat_Materialeinkauf_view.class);
		cr.add(Restrictions.eq("neuVon","SYS"));
		
		List<?> results = cr.list();
		
		return results;
	}
}
