package unit.com.prenda;

import java.io.Serializable;

import org.junit.Assert;
import org.junit.Test;


import com.prenda.factories.*;
import com.prenda.model.obj.*;
import com.prenda.services.data.DataLayerPrenda;
import com.prenda.services.data.DataLayerPrendaImpl;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.transaction.annotation.Transactional;

/** Hibernate tester.
* @author autogenerated
*/
@ContextConfiguration(locations = { "/applicationContext.xml" } )
@RunWith(SpringJUnit4ClassRunner.class)
public class DAOIntegrationTest {
		

	/**
	 * Clears the database.
	 */
	@Test
	@Transactional
	public void testPreCleanDBFirstPass() {
		// We'll ignore any exceptions in this pass to give time for the custom exec to execute too 
		// (+ clear out any DB loops)
	
		try{HibernatePrendaDaoFactory.getUsersDao().getQuery("delete from Users").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getRedeemDao().getQuery("delete from Redeem").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getPulloutDao().getQuery("delete from Pullout").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getPawnDao().getQuery("delete from Pawn").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getPageDao().getQuery("delete from Page").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getLevelDao().getQuery("delete from Level").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getLedgerDao().getQuery("delete from Ledger").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getJournalDao().getQuery("delete from Journal").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getInterestDao().getQuery("delete from Interest").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getGenkeyDao().getQuery("delete from Genkey").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getCustomerDao().getQuery("delete from Customer").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getBranchDao().getQuery("delete from Branch").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getAccountsDao().getQuery("delete from Accounts").executeUpdate(); } catch (Exception e) { /* do nothing */ }


		
	}
	/**
	 * Clears the database.
	 */
	@Test
	@Transactional
	public void testPreCleanDBFinalPass() {
	
		HibernatePrendaDaoFactory.getUsersDao().getQuery("delete from Users").executeUpdate();
		HibernatePrendaDaoFactory.getRedeemDao().getQuery("delete from Redeem").executeUpdate();
		HibernatePrendaDaoFactory.getPulloutDao().getQuery("delete from Pullout").executeUpdate();
		HibernatePrendaDaoFactory.getPawnDao().getQuery("delete from Pawn").executeUpdate();
		HibernatePrendaDaoFactory.getPageDao().getQuery("delete from Page").executeUpdate();
		HibernatePrendaDaoFactory.getLevelDao().getQuery("delete from Level").executeUpdate();
		HibernatePrendaDaoFactory.getLedgerDao().getQuery("delete from Ledger").executeUpdate();
		HibernatePrendaDaoFactory.getJournalDao().getQuery("delete from Journal").executeUpdate();
		HibernatePrendaDaoFactory.getInterestDao().getQuery("delete from Interest").executeUpdate();
		HibernatePrendaDaoFactory.getGenkeyDao().getQuery("delete from Genkey").executeUpdate();
		HibernatePrendaDaoFactory.getCustomerDao().getQuery("delete from Customer").executeUpdate();
		HibernatePrendaDaoFactory.getBranchDao().getQuery("delete from Branch").executeUpdate();
		HibernatePrendaDaoFactory.getAccountsDao().getQuery("delete from Accounts").executeUpdate();


		
	}

	
	/**
	 * Hibernate test case for table: prenda.accounts.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testAccounts() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Accounts accounts = PrendaDataPoolFactory.getAccounts();
		dataLayerPrenda.saveOrUpdate(accounts);

		Byte accountsId = accounts.getId();
		Accounts copy = accounts.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(accounts); 		 

		accounts = dataLayerPrenda.getAccounts(accountsId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.getAccountcode(), accounts.getAccountcode());
		Assert.assertEquals(copy.getAccountname(), accounts.getAccountname());
		Assert.assertEquals(copy.getId(), accounts.getId());
		// tests for coverage completeness
		Assert.assertFalse(accounts.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(accounts.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}
	/**
	 * Hibernate test case for table: prenda.branch.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testBranch() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Branch branch = PrendaDataPoolFactory.getBranch();
		dataLayerPrenda.saveOrUpdate(branch);

		Byte branchId = branch.getId();
		Branch copy = branch.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(branch); 		 

		branch = dataLayerPrenda.getBranch(branchId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.getAddress(), branch.getAddress());
		Assert.assertEquals(copy.getAdvanceInterest(), branch.getAdvanceInterest(), 0.1);
		Assert.assertEquals(copy.isArchive(), branch.isArchive());
		Assert.assertEquals(copy.getBalance(), branch.getBalance(), 0.1);
		Assert.assertEquals(copy.getCounter(), branch.getCounter());
		Assert.assertEquals(copy.getExtend(), branch.getExtend());
		Assert.assertEquals(copy.getName(), branch.getName());
		Assert.assertEquals(copy.getOwner(), branch.getOwner());
		Assert.assertEquals(copy.getPtNumber(), branch.getPtNumber());
		Assert.assertEquals(copy.getReserve(), branch.getReserve());
		Assert.assertEquals(copy.getServiceCharge(), branch.getServiceCharge(), 0.1);
		// tests for coverage completeness
		Assert.assertFalse(branch.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(branch.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}
	/**
	 * Hibernate test case for table: prenda.customer.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testCustomer() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Customer customer = PrendaDataPoolFactory.getCustomer();
		dataLayerPrenda.saveOrUpdate(customer);

		Long customerId = customer.getId();
		Customer copy = customer.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(customer); 		 

		customer = dataLayerPrenda.getCustomer(customerId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.getAddress(), customer.getAddress());
		Assert.assertEquals(copy.isArchive(), customer.isArchive());
		Assert.assertEquals(copy.getFirstName(), customer.getFirstName());
		Assert.assertEquals(copy.getLastName(), customer.getLastName());
		Assert.assertEquals(copy.getMiddleName(), customer.getMiddleName());
		// tests for coverage completeness
		Assert.assertFalse(customer.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(customer.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}
	/**
	 * Hibernate test case for table: prenda.genkey.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testGenkey() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Genkey genkey = PrendaDataPoolFactory.getGenkey();
		dataLayerPrenda.saveOrUpdate(genkey);

		Long genkeyId = genkey.getId();
		Genkey copy = genkey.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(genkey); 		 

		genkey = dataLayerPrenda.getGenkey(genkeyId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.getId(), genkey.getId());
		Assert.assertEquals(copy.getPassword(), genkey.getPassword());
		// tests for coverage completeness
		Assert.assertFalse(genkey.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(genkey.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}
	/**
	 * Hibernate test case for table: prenda.interest.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testInterest() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Interest interest = PrendaDataPoolFactory.getInterest();
		dataLayerPrenda.saveOrUpdate(interest);

		Serializable interestId = interest.getInterestPK().getInterestid();
		Interest copy = interest.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(interest); 		 

		interest = dataLayerPrenda.getInterest(interestId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.getInterestPK().getDay(), interest.getInterestPK().getDay());
		Assert.assertEquals(copy.getInterestPK().getInterestid(), interest.getInterestPK().getInterestid());
		Assert.assertEquals(copy.getRate(), interest.getRate());
		// tests for coverage completeness
		Assert.assertFalse(interest.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(interest.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}
	/**
	 * Hibernate test case for table: prenda.journal.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testJournal() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Journal journal = PrendaDataPoolFactory.getJournal();
		dataLayerPrenda.saveOrUpdate(journal);

		Long journalId = journal.getId();
		Journal copy = journal.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(journal); 		 

		journal = dataLayerPrenda.getJournal(journalId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.getAccountid(), journal.getAccountid());
		Assert.assertEquals(copy.getAmount(), journal.getAmount(), 0.1);
		Assert.assertEquals(copy.getBranchid(), journal.getBranchid());
		Assert.assertEquals(copy.getDescription(), journal.getDescription());
		Assert.assertEquals(new java.text.SimpleDateFormat("dd/MM/yyyy").format(copy.getJournalDate().getTime()), new java.text.SimpleDateFormat("dd/MM/yyyy").format(journal.getJournalDate().getTime()));
		Assert.assertEquals(copy.getJournalGroup(), journal.getJournalGroup());
		// tests for coverage completeness
		Assert.assertFalse(journal.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(journal.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}
	/**
	 * Hibernate test case for table: prenda.ledger.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testLedger() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Ledger ledger = PrendaDataPoolFactory.getLedger();
		dataLayerPrenda.saveOrUpdate(ledger);

		Long ledgerId = ledger.getId();
		Ledger copy = ledger.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(ledger); 		 

		ledger = dataLayerPrenda.getLedger(ledgerId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.getEncoder(), ledger.getEncoder());
		Assert.assertEquals(copy.getId(), ledger.getId());
		Assert.assertEquals(new java.text.SimpleDateFormat("dd/MM/yyyy").format(copy.getLedgerDate().getTime()), new java.text.SimpleDateFormat("dd/MM/yyyy").format(ledger.getLedgerDate().getTime()));
		// tests for coverage completeness
		Assert.assertFalse(ledger.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(ledger.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}
	/**
	 * Hibernate test case for table: prenda.level.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testLevel() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Level level = PrendaDataPoolFactory.getLevel();
		dataLayerPrenda.saveOrUpdate(level);

		Byte levelId = level.getId();
		Level copy = level.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(level); 		 

		level = dataLayerPrenda.getLevel(levelId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.getDescription(), level.getDescription());
		Assert.assertEquals(copy.getId(), level.getId());
		// tests for coverage completeness
		Assert.assertFalse(level.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(level.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}
	/**
	 * Hibernate test case for table: prenda.page.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testPage() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Page page = PrendaDataPoolFactory.getPage();
		dataLayerPrenda.saveOrUpdate(page);

		Long pageId = page.getId();
		Page copy = page.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(page); 		 

		page = dataLayerPrenda.getPage(pageId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.getAuction(), page.getAuction());
		Assert.assertEquals(copy.getCustomer(), page.getCustomer());
		Assert.assertEquals(copy.getForeclose(), page.getForeclose());
		Assert.assertEquals(copy.getId(), page.getId());
		Assert.assertEquals(copy.getInventory(), page.getInventory());
		Assert.assertEquals(copy.getOutstanding(), page.getOutstanding());
		Assert.assertEquals(copy.getPawn(), page.getPawn());
		Assert.assertEquals(copy.getPullout(), page.getPullout());
		Assert.assertEquals(copy.getRedeem(), page.getRedeem());
		Assert.assertEquals(copy.getUser(), page.getUser());
		// tests for coverage completeness
		Assert.assertFalse(page.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(page.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}
	/**
	 * Hibernate test case for table: prenda.pawn.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testPawn() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Pawn pawn = PrendaDataPoolFactory.getPawn();
		dataLayerPrenda.saveOrUpdate(pawn);

		Long pawnId = pawn.getId();
		Pawn copy = pawn.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(pawn); 		 

		pawn = dataLayerPrenda.getPawn(pawnId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.getAdvanceInterest(), pawn.getAdvanceInterest(), 0.1);
		Assert.assertEquals(copy.getAppraised(), pawn.getAppraised(), 0.1);
		Assert.assertEquals(copy.getBcode(), pawn.getBcode());
		Assert.assertEquals(copy.getBpid(), pawn.getBpid());
		Assert.assertEquals(copy.getBranch(), pawn.getBranch());
		Assert.assertEquals(copy.getCreateDate().getTime() / 1000, pawn.getCreateDate().getTime() / 1000);
		Assert.assertEquals(copy.getDescription(), pawn.getDescription());
		Assert.assertEquals(copy.getEncoder(), pawn.getEncoder());
		Assert.assertEquals(copy.getExtend(), pawn.getExtend());
		Assert.assertEquals(copy.getLoan(), pawn.getLoan(), 0.1);
		Assert.assertEquals(new java.text.SimpleDateFormat("dd/MM/yyyy").format(copy.getLoanDate().getTime()), new java.text.SimpleDateFormat("dd/MM/yyyy").format(pawn.getLoanDate().getTime()));
		Assert.assertEquals(copy.getNameid(), pawn.getNameid());
		Assert.assertEquals(copy.getPt(), pawn.getPt());
		Assert.assertEquals(copy.getSerial(), pawn.getSerial());
		Assert.assertEquals(copy.getServiceCharge(), pawn.getServiceCharge(), 0.1);
		// tests for coverage completeness
		Assert.assertFalse(pawn.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(pawn.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}
	/**
	 * Hibernate test case for table: prenda.pullout.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testPullout() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Pullout pullout = PrendaDataPoolFactory.getPullout();
		dataLayerPrenda.saveOrUpdate(pullout);

		Long pulloutId = pullout.getId();
		Pullout copy = pullout.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(pullout); 		 

		pullout = dataLayerPrenda.getPullout(pulloutId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.isAuction(), pullout.isAuction());
		Assert.assertEquals(copy.getCreateDate().getTime() / 1000, pullout.getCreateDate().getTime() / 1000);
		Assert.assertEquals(copy.getEncoder(), pullout.getEncoder());
		Assert.assertEquals(copy.getId(), pullout.getId());
		Assert.assertEquals(new java.text.SimpleDateFormat("dd/MM/yyyy").format(copy.getPulloutDate().getTime()), new java.text.SimpleDateFormat("dd/MM/yyyy").format(pullout.getPulloutDate().getTime()));
		Assert.assertEquals(copy.getUsername(), pullout.getUsername());
		// tests for coverage completeness
		Assert.assertFalse(pullout.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(pullout.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}
	/**
	 * Hibernate test case for table: prenda.redeem.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testRedeem() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Redeem redeem = PrendaDataPoolFactory.getRedeem();
		dataLayerPrenda.saveOrUpdate(redeem);

		Long redeemId = redeem.getId();
		Redeem copy = redeem.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(redeem); 		 

		redeem = dataLayerPrenda.getRedeem(redeemId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.getCreateDate().getTime() / 1000, redeem.getCreateDate().getTime() / 1000);
		Assert.assertEquals(copy.getEncoder(), redeem.getEncoder());
		Assert.assertEquals(copy.getId(), redeem.getId());
		Assert.assertEquals(copy.getInterest(), redeem.getInterest(), 0.1);
		Assert.assertEquals(new java.text.SimpleDateFormat("dd/MM/yyyy").format(copy.getRedeemDate().getTime()), new java.text.SimpleDateFormat("dd/MM/yyyy").format(redeem.getRedeemDate().getTime()));
		// tests for coverage completeness
		Assert.assertFalse(redeem.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(redeem.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}
	/**
	 * Hibernate test case for table: prenda.users.
	 * @throws CloneNotSupportedException on clone error
	 */
	@Transactional
	@Test		
	public void testUsers() throws CloneNotSupportedException {

	 	DataLayerPrenda dataLayerPrenda = DataLayerPrendaImpl.getInstance();
		Users users = PrendaDataPoolFactory.getUsers();
		dataLayerPrenda.saveOrUpdate(users);

		Byte usersId = users.getId();
		Users copy = users.clone();
		dataLayerPrenda.flushSession(); // flush+evict from cache to make sure we hit the DB next 
		dataLayerPrenda.evict(users); 		 

		users = dataLayerPrenda.getUsers(usersId); 	// load it again


		// Validity checks
		Assert.assertNotNull(copy);
		// null equals check
		Assert.assertFalse(copy.equals(null));
		
		Assert.assertEquals(copy.isArchive(), users.isArchive());
		Assert.assertEquals(copy.getBranch(), users.getBranch());
		Assert.assertEquals(copy.getFirstname(), users.getFirstname());
		Assert.assertEquals(copy.getLastname(), users.getLastname());
		Assert.assertEquals(copy.getLevel(), users.getLevel());
		Assert.assertEquals(new java.text.SimpleDateFormat("dd/MM/yyyy").format(copy.getLoanDate().getTime()), new java.text.SimpleDateFormat("dd/MM/yyyy").format(users.getLoanDate().getTime()));
		Assert.assertEquals(copy.getMi(), users.getMi());
		Assert.assertEquals(copy.getPassword(), users.getPassword());
		Assert.assertEquals(copy.getUsername(), users.getUsername());
		// tests for coverage completeness
		Assert.assertFalse(users.toString().equals(""));
		Assert.assertEquals(copy, copy.clone());
		// symmetric equality check
		Assert.assertEquals(copy.clone(), copy);
		// reflexive equality check
		Assert.assertEquals(copy, copy);
		// hashcode on identical object should return same number
		Assert.assertEquals(users.hashCode(), copy.hashCode());  
		Assert.assertNotSame(copy, 0L);
	  // End of table
	}

	/**
	 * Clears the database.
	 */
	@Test
	@Transactional
	public void testPostCleanDBFirstPass() {
		// We'll ignore any exceptions in this pass to give time for the custom exec to execute too 
		// (+ clear out any DB loops)
	
		try{HibernatePrendaDaoFactory.getUsersDao().getQuery("delete from Users").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getRedeemDao().getQuery("delete from Redeem").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getPulloutDao().getQuery("delete from Pullout").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getPawnDao().getQuery("delete from Pawn").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getPageDao().getQuery("delete from Page").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getLevelDao().getQuery("delete from Level").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getLedgerDao().getQuery("delete from Ledger").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getJournalDao().getQuery("delete from Journal").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getInterestDao().getQuery("delete from Interest").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getGenkeyDao().getQuery("delete from Genkey").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getCustomerDao().getQuery("delete from Customer").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getBranchDao().getQuery("delete from Branch").executeUpdate(); } catch (Exception e) { /* do nothing */ }
		try{HibernatePrendaDaoFactory.getAccountsDao().getQuery("delete from Accounts").executeUpdate(); } catch (Exception e) { /* do nothing */ }


		
	}

	/**
	 * Clears the database.
	 */
	@Test
	@Transactional
	public void postCleanDBFinalPass() {
	
		HibernatePrendaDaoFactory.getUsersDao().getQuery("delete from Users").executeUpdate();
		HibernatePrendaDaoFactory.getRedeemDao().getQuery("delete from Redeem").executeUpdate();
		HibernatePrendaDaoFactory.getPulloutDao().getQuery("delete from Pullout").executeUpdate();
		HibernatePrendaDaoFactory.getPawnDao().getQuery("delete from Pawn").executeUpdate();
		HibernatePrendaDaoFactory.getPageDao().getQuery("delete from Page").executeUpdate();
		HibernatePrendaDaoFactory.getLevelDao().getQuery("delete from Level").executeUpdate();
		HibernatePrendaDaoFactory.getLedgerDao().getQuery("delete from Ledger").executeUpdate();
		HibernatePrendaDaoFactory.getJournalDao().getQuery("delete from Journal").executeUpdate();
		HibernatePrendaDaoFactory.getInterestDao().getQuery("delete from Interest").executeUpdate();
		HibernatePrendaDaoFactory.getGenkeyDao().getQuery("delete from Genkey").executeUpdate();
		HibernatePrendaDaoFactory.getCustomerDao().getQuery("delete from Customer").executeUpdate();
		HibernatePrendaDaoFactory.getBranchDao().getQuery("delete from Branch").executeUpdate();
		HibernatePrendaDaoFactory.getAccountsDao().getQuery("delete from Accounts").executeUpdate();


		
	}

}

