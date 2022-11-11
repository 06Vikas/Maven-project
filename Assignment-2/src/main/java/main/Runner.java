package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Repositories.AccountDAO;
import entities.Account;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private AccountDAO accountDAO ;

	@Override
	public void run(String... args) throws Exception {
		Account account1=new Account("Vikas",123456789L,22335L);
		accountDAO.save(account1);
		
	}

}
