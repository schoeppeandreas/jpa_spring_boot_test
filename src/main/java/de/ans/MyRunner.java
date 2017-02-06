package de.ans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner  {
	@Autowired
	Service_Arbeitsvorrat_Materialeinkauf_view service_Arbeitsvorrat_Materialeinkauf_view;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("Test >> ApplicationRunner");
		System.out.println(service_Arbeitsvorrat_Materialeinkauf_view.getWorkList().size());
	}
}