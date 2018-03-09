package com.prenda.services.data;

import com.prenda.model.obj.prenda.Accounts;
import com.prenda.model.obj.prenda.Branch;
import com.prenda.model.obj.prenda.Customer;
import com.prenda.model.obj.prenda.Genkey;
import com.prenda.model.obj.prenda.Interest;
import com.prenda.model.obj.prenda.InterestPK;
import com.prenda.model.obj.prenda.Jewelry;
import com.prenda.model.obj.prenda.JewelryPK;
import com.prenda.model.obj.prenda.Journal;
import com.prenda.model.obj.prenda.Ledger;
import com.prenda.model.obj.prenda.Level;
import com.prenda.model.obj.prenda.Limits;
import com.prenda.model.obj.prenda.Page;
import com.prenda.model.obj.prenda.Pawn;
import com.prenda.model.obj.prenda.Pullout;
import com.prenda.model.obj.prenda.Redeem;
import com.prenda.model.obj.prenda.Users;
import java.io.Serializable;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.ReplicationMode;
import org.hibernate.Session;
import java.util.Collection;
import com.github.wwadge.hbnpojogen.persistence.IPojoGenEntity;
/** 
 * Data layer.
 * @author autogenerated
 */
public interface DataLayerPrenda {

    /**
     * Deletes the given object from disk.
     * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to delete
     */
    <T> void delete(T persistentObject);
    /**
     * Refresh the object $class.className from disk.
     * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to reload
     */
    <T> void refresh(T persistentObject);

    /**
     * Saves the given object to disk.
     * @param persistentObject Object to save
	 * @param <T> A DataLayerObject-derived type
     * @return Identifier of saved object 
     */
    <T> Serializable save(T persistentObject);
    /**
     * Saves or updates the given $class.className object to disk.
	 * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to save 
     */
    <T> void saveOrUpdate(T persistentObject);
    /**
     * Updates the given object to disk.
	 * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to update 
     */
    <T> void update(T persistentObject);


    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Accounts obj) directly
     * @param id Identifier to delete
     */
    void deleteAccounts(final Byte id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Accounts object
     */
    Accounts loadAccounts(final Byte id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Accounts getAccounts(final Byte id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Branch obj) directly
     * @param id Identifier to delete
     */
    void deleteBranch(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Branch object
     */
    Branch loadBranch(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Branch getBranch(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Customer obj) directly
     * @param id Identifier to delete
     */
    void deleteCustomer(final Long id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Customer object
     */
    Customer loadCustomer(final Long id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Customer getCustomer(final Long id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Genkey obj) directly
     * @param id Identifier to delete
     */
    void deleteGenkey(final Long id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Genkey object
     */
    Genkey loadGenkey(final Long id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Genkey getGenkey(final Long id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Interest obj) directly
     * @param id Identifier to delete
     */
    void deleteInterest(final InterestPK id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Interest object
     */
    Interest loadInterest(final InterestPK id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Interest getInterest(final InterestPK id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Jewelry obj) directly
     * @param id Identifier to delete
     */
    void deleteJewelry(final JewelryPK id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Jewelry object
     */
    Jewelry loadJewelry(final JewelryPK id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Jewelry getJewelry(final JewelryPK id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Journal obj) directly
     * @param id Identifier to delete
     */
    void deleteJournal(final Long id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Journal object
     */
    Journal loadJournal(final Long id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Journal getJournal(final Long id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Ledger obj) directly
     * @param id Identifier to delete
     */
    void deleteLedger(final Long id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Ledger object
     */
    Ledger loadLedger(final Long id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Ledger getLedger(final Long id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Level obj) directly
     * @param id Identifier to delete
     */
    void deleteLevel(final Byte id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Level object
     */
    Level loadLevel(final Byte id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Level getLevel(final Byte id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Limits obj) directly
     * @param id Identifier to delete
     */
    void deleteLimits(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Limits object
     */
    Limits loadLimits(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Limits getLimits(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Page obj) directly
     * @param id Identifier to delete
     */
    void deletePage(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Page object
     */
    Page loadPage(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Page getPage(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Pawn obj) directly
     * @param id Identifier to delete
     */
    void deletePawn(final Long id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Pawn object
     */
    Pawn loadPawn(final Long id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Pawn getPawn(final Long id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Pullout obj) directly
     * @param id Identifier to delete
     */
    void deletePullout(final Long id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Pullout object
     */
    Pullout loadPullout(final Long id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Pullout getPullout(final Long id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Redeem obj) directly
     * @param id Identifier to delete
     */
    void deleteRedeem(final Long id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Redeem object
     */
    Redeem loadRedeem(final Long id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Redeem getRedeem(final Long id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Users obj) directly
     * @param id Identifier to delete
     */
    void deleteUsers(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Users object
     */
    Users loadUsers(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Users getUsers(final Integer id);  
    /** Returns a query handle.
     * @param query Query to use
     * @return A query instance
     */
     Query createQuery(final String query);
    /** Returns a criteria handle.
     * @param criteria Criteria to use
     * @return A criteria instance
     */
     Criteria createCriteria(final String criteria);
    /** Returns a Query handle based on your package-level named query.
     * @param query Query to use
     * @return A query instance
     */
     Query getNamedQuery(final String query);
    /** Create a new Criteria instance, for the given entity class, or a superclass of an entity class.
	* @param persistentObject a class, which is persistent, or has persistent subclasses 
	* @return Criteria instance
	*/
	@SuppressWarnings("unchecked")
	Criteria createCriteria(Class persistentObject);
    /** Flushes the currently open session.
	*/
	void flushSession();
    /** Clears the currently open session.
	*/
	void clearSession();
    /** Flushes and clears the currently open session.
	*/
	void flushAndClearSession();
	/** Call currentSession.replicate.
	 * @param obj to replicate
	 * @param replicationMode mode
	 */ 
	void replicate(Object obj, ReplicationMode replicationMode);
	/** Hibernate Merge. 
	 * @param obj to merge
	 * @return obj merged.
	 */
	Object merge(Object obj);
	/** Returns the current session.
	 * @return the currently active session
	 */
	Session getCurrentSession();
	/** Returns a query handle.
     * @param query Query to use
     * @return A query instance
     */
     SQLQuery createSQLQuery(final String query);
    /** Remove this instance from the session cache. 
	 * Changes to the instance will not be synchronized with the database
	 * @param obj object to evict
	 */
	void evict(Object obj);
    /**
     * Return the persistent instance of the given entity class with the given 
     * identifier, or null if there is no such persistent instance. 
     * (If the instance, or a proxy for the instance, is already 
     * associated with the session, return that instance or proxy)
     *
     * @param clazz a persistent class
     * @param id a valid identifier of an existing persistent instance of the class
     * @return a persistent instance or null
     * @throws HibernateException
     */
	Object get(Class<?> clazz, Serializable id) throws HibernateException;	


    /**
     * Return the persistent instance of the given entity class with the given identifier, assuming that the instance exists.
     *You should not use this method to determine if an instance exists (use get() instead). Use this only to retrieve an instance that you assume exists, where non-existence would be an actual error.
     *
     * @param clazz a persistent class
     * @param id a valid identifier of an existing persistent instance of the class
     * @return the persistent instance or proxy
     * @throws HibernateException
     */
	Object load(Class<?> clazz, Serializable id) throws HibernateException;
	/**
	 * Reattaches the given entity to the current session using LockMode.NONE
	 *
	 * @param entity to reattach
	 */
	void reattachEntityWithNoLock(IPojoGenEntity entity);
	/**
	 * Reattaches the given entities to the current session.
	 *
	 * @param entities to attach
	 */
	void reattachEntitiesWithNoLock(Collection<? extends IPojoGenEntity> entities);}

