package com.prenda.model.obj.prenda;

import com.github.wwadge.hbnpojogen.persistence.IPojoGenEntity;
import com.prenda.model.obj.prenda.iface.IPage;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;


/** 
 * Object mapping for hibernate-handled table: page.
 * @author autogenerated
 */

@Entity
@Table(name = "page", catalog = "prenda")
public class Page implements Cloneable, Serializable, IPojoGenEntity, IPage {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559018146L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Byte auction;
	/** Field mapping. */
	private Byte customer;
	/** Field mapping. */
	private Byte foreclose;
	/** Field mapping. */
	private Integer id;
	/** Field mapping. */
	private Byte inventory;
	/** Field mapping. */
	private Byte outstanding;
	/** Field mapping. */
	private Byte pawn;
	/** Field mapping. */
	private Byte pullout;
	/** Field mapping. */
	private Byte redeem;
	/** Field mapping. */
	private Byte user;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Page() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Page(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param auction Byte object;
	 * @param customer Byte object;
	 * @param foreclose Byte object;
	 * @param id Integer object;
	 * @param inventory Byte object;
	 * @param outstanding Byte object;
	 * @param pawn Byte object;
	 * @param pullout Byte object;
	 * @param redeem Byte object;
	 * @param user Byte object;
	 */
	public Page(Byte auction, Byte customer, Byte foreclose, 					
			Integer id, Byte inventory, Byte outstanding, 					
			Byte pawn, Byte pullout, Byte redeem, 					
			Byte user) {

		this.auction = auction;
		this.customer = customer;
		this.foreclose = foreclose;
		this.id = id;
		this.inventory = inventory;
		this.outstanding = outstanding;
		this.pawn = pawn;
		this.pullout = pullout;
		this.redeem = redeem;
		this.user = user;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Page.class;
	}
 

    /**
     * Return the value associated with the column: auction.
	 * @return A Byte object (this.auction)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Byte getAuction() {
		return this.auction;
		
	}
	

  
    /**  
     * Set the value related to the column: auction.
	 * @param auction the auction value you wish to set
	 */
	public void setAuction(final Byte auction) {
		this.auction = auction;
	}

    /**
     * Return the value associated with the column: customer.
	 * @return A Byte object (this.customer)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Byte getCustomer() {
		return this.customer;
		
	}
	

  
    /**  
     * Set the value related to the column: customer.
	 * @param customer the customer value you wish to set
	 */
	public void setCustomer(final Byte customer) {
		this.customer = customer;
	}

    /**
     * Return the value associated with the column: foreclose.
	 * @return A Byte object (this.foreclose)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Byte getForeclose() {
		return this.foreclose;
		
	}
	

  
    /**  
     * Set the value related to the column: foreclose.
	 * @param foreclose the foreclose value you wish to set
	 */
	public void setForeclose(final Byte foreclose) {
		this.foreclose = foreclose;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@Basic( optional = false )
	@Column( name = "pageid", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: inventory.
	 * @return A Byte object (this.inventory)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Byte getInventory() {
		return this.inventory;
		
	}
	

  
    /**  
     * Set the value related to the column: inventory.
	 * @param inventory the inventory value you wish to set
	 */
	public void setInventory(final Byte inventory) {
		this.inventory = inventory;
	}

    /**
     * Return the value associated with the column: outstanding.
	 * @return A Byte object (this.outstanding)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Byte getOutstanding() {
		return this.outstanding;
		
	}
	

  
    /**  
     * Set the value related to the column: outstanding.
	 * @param outstanding the outstanding value you wish to set
	 */
	public void setOutstanding(final Byte outstanding) {
		this.outstanding = outstanding;
	}

    /**
     * Return the value associated with the column: pawn.
	 * @return A Byte object (this.pawn)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Byte getPawn() {
		return this.pawn;
		
	}
	

  
    /**  
     * Set the value related to the column: pawn.
	 * @param pawn the pawn value you wish to set
	 */
	public void setPawn(final Byte pawn) {
		this.pawn = pawn;
	}

    /**
     * Return the value associated with the column: pullout.
	 * @return A Byte object (this.pullout)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Byte getPullout() {
		return this.pullout;
		
	}
	

  
    /**  
     * Set the value related to the column: pullout.
	 * @param pullout the pullout value you wish to set
	 */
	public void setPullout(final Byte pullout) {
		this.pullout = pullout;
	}

    /**
     * Return the value associated with the column: redeem.
	 * @return A Byte object (this.redeem)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Byte getRedeem() {
		return this.redeem;
		
	}
	

  
    /**  
     * Set the value related to the column: redeem.
	 * @param redeem the redeem value you wish to set
	 */
	public void setRedeem(final Byte redeem) {
		this.redeem = redeem;
	}

    /**
     * Return the value associated with the column: user.
	 * @return A Byte object (this.user)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Byte getUser() {
		return this.user;
		
	}
	

  
    /**  
     * Set the value related to the column: user.
	 * @param user the user value you wish to set
	 */
	public void setUser(final Byte user) {
		this.user = user;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Page clone() throws CloneNotSupportedException {
		
        final Page copy = (Page)super.clone();

		copy.setAuction(this.getAuction());
		copy.setCustomer(this.getCustomer());
		copy.setForeclose(this.getForeclose());
		copy.setId(this.getId());
		copy.setInventory(this.getInventory());
		copy.setOutstanding(this.getOutstanding());
		copy.setPawn(this.getPawn());
		copy.setPullout(this.getPullout());
		copy.setRedeem(this.getRedeem());
		copy.setUser(this.getUser());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("auction: " + this.getAuction() + ", ");
		sb.append("customer: " + this.getCustomer() + ", ");
		sb.append("foreclose: " + this.getForeclose() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("inventory: " + this.getInventory() + ", ");
		sb.append("outstanding: " + this.getOutstanding() + ", ");
		sb.append("pawn: " + this.getPawn() + ", ");
		sb.append("pullout: " + this.getPullout() + ", ");
		sb.append("redeem: " + this.getRedeem() + ", ");
		sb.append("user: " + this.getUser());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final Page that; 
		try {
			that = (Page) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getAuction() == null) && (that.getAuction() == null)) || (getAuction() != null && getAuction().equals(that.getAuction())));
		result = result && (((getCustomer() == null) && (that.getCustomer() == null)) || (getCustomer() != null && getCustomer().equals(that.getCustomer())));
		result = result && (((getForeclose() == null) && (that.getForeclose() == null)) || (getForeclose() != null && getForeclose().equals(that.getForeclose())));
		result = result && (((getInventory() == null) && (that.getInventory() == null)) || (getInventory() != null && getInventory().equals(that.getInventory())));
		result = result && (((getOutstanding() == null) && (that.getOutstanding() == null)) || (getOutstanding() != null && getOutstanding().equals(that.getOutstanding())));
		result = result && (((getPawn() == null) && (that.getPawn() == null)) || (getPawn() != null && getPawn().equals(that.getPawn())));
		result = result && (((getPullout() == null) && (that.getPullout() == null)) || (getPullout() != null && getPullout().equals(that.getPullout())));
		result = result && (((getRedeem() == null) && (that.getRedeem() == null)) || (getRedeem() != null && getRedeem().equals(that.getRedeem())));
		result = result && (((getUser() == null) && (that.getUser() == null)) || (getUser() != null && getUser().equals(that.getUser())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}
