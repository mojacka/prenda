package com.prenda.model.obj;

import com.github.wwadge.hbnpojogen.persistence.IPojoGenEntity;
import com.prenda.model.obj.iface.IBranch;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;


/** 
 * Object mapping for hibernate-handled table: branch.
 * @author autogenerated
 */

@Entity
@Table(name = "branch", catalog = "prenda")
public class Branch implements Cloneable, Serializable, IPojoGenEntity, IBranch {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559018159L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Byte> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Byte>());
	
	/** hashCode temporary storage. */
	private volatile Byte hashCode;
	

	/** Field mapping. */
	private String address;
	/** Field mapping. */
	private Double advanceInterest;
	/** Field mapping. */
	private Boolean archive;
	/** Field mapping. */
	private Double balance;
	/** Field mapping. */
	private Long counter;
	/** Field mapping. */
	private Byte extend;
	/** Field mapping. */
	private Byte id = new Byte((byte)0); // init for hibernate bug workaround
	/** Field mapping. */
	private String name;
	/** Field mapping. */
	private Byte owner;
	/** Field mapping. */
	private Long ptNumber;
	/** Field mapping. */
	private Byte reserve;
	/** Field mapping. */
	private Double serviceCharge;
	
	private List<Users> users;
	
	private List<Interest> interest;
	
	@OneToMany
	@JoinColumn(name="branchid")
	public List<Interest> getInterest() {
		return interest;
	}

	public void setInterest(List<Interest> interest) {
		this.interest = interest;
	}

	@OneToMany
	@JoinColumn(name="branchid")
	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Branch() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Branch(Byte id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param address String object;
	 * @param advanceInterest Double object;
	 * @param archive Boolean object;
	 * @param balance Double object;
	 * @param counter Long object;
	 * @param extend Byte object;
	 * @param id Byte object;
	 * @param name String object;
	 * @param owner Byte object;
	 * @param ptNumber Long object;
	 * @param reserve Byte object;
	 * @param serviceCharge Double object;
	 */
	public Branch(String address, Double advanceInterest, Boolean archive, 					
			Double balance, Long counter, Byte extend, 					
			Byte id, String name, Byte owner, 					
			Long ptNumber, Byte reserve, Double serviceCharge) {

		this.address = address;
		this.advanceInterest = advanceInterest;
		this.archive = archive;
		this.balance = balance;
		this.counter = counter;
		this.extend = extend;
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.ptNumber = ptNumber;
		this.reserve = reserve;
		this.serviceCharge = serviceCharge;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Branch.class;
	}
 

    /**
     * Return the value associated with the column: address.
	 * @return A String object (this.address)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 100  )
	public String getAddress() {
		return this.address;
		
	}
	

  
    /**  
     * Set the value related to the column: address.
	 * @param address the address value you wish to set
	 */
	public void setAddress(final String address) {
		this.address = address;
	}

    /**
     * Return the value associated with the column: advanceInterest.
	 * @return A Double object (this.advanceInterest)
	 */
	@Basic( optional = false )
	@Column( name = "advance_interest", nullable = false  )
	public Double getAdvanceInterest() {
		return this.advanceInterest;
		
	}
	

  
    /**  
     * Set the value related to the column: advanceInterest.
	 * @param advanceInterest the advanceInterest value you wish to set
	 */
	public void setAdvanceInterest(final Double advanceInterest) {
		this.advanceInterest = advanceInterest;
	}

    /**
     * Return the value associated with the column: archive.
	 * @return A Boolean object (this.archive)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Boolean isArchive() {
		return this.archive;
		
	}
	

  
    /**  
     * Set the value related to the column: archive.
	 * @param archive the archive value you wish to set
	 */
	public void setArchive(final Boolean archive) {
		this.archive = archive;
	}

    /**
     * Return the value associated with the column: balance.
	 * @return A Double object (this.balance)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Double getBalance() {
		return this.balance;
		
	}
	

  
    /**  
     * Set the value related to the column: balance.
	 * @param balance the balance value you wish to set
	 */
	public void setBalance(final Double balance) {
		this.balance = balance;
	}

    /**
     * Return the value associated with the column: counter.
	 * @return A Long object (this.counter)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Long getCounter() {
		return this.counter;
		
	}
	

  
    /**  
     * Set the value related to the column: counter.
	 * @param counter the counter value you wish to set
	 */
	public void setCounter(final Long counter) {
		this.counter = counter;
	}

    /**
     * Return the value associated with the column: extend.
	 * @return A Byte object (this.extend)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Byte getExtend() {
		return this.extend;
		
	}
	

  
    /**  
     * Set the value related to the column: extend.
	 * @param extend the extend value you wish to set
	 */
	public void setExtend(final Byte extend) {
		this.extend = extend;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Byte object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "branchid", nullable = false  )
	public Byte getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Byte id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null ) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: name.
	 * @return A String object (this.name)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 50  )
	public String getName() {
		return this.name;
		
	}
	

  
    /**  
     * Set the value related to the column: name.
	 * @param name the name value you wish to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

    /**
     * Return the value associated with the column: owner.
	 * @return A Byte object (this.owner)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Byte getOwner() {
		return this.owner;
		
	}
	

  
    /**  
     * Set the value related to the column: owner.
	 * @param owner the owner value you wish to set
	 */
	public void setOwner(final Byte owner) {
		this.owner = owner;
	}

    /**
     * Return the value associated with the column: ptNumber.
	 * @return A Long object (this.ptNumber)
	 */
	@Basic( optional = false )
	@Column( name = "pt_number", nullable = false  )
	public Long getPtNumber() {
		return this.ptNumber;
		
	}
	

  
    /**  
     * Set the value related to the column: ptNumber.
	 * @param ptNumber the ptNumber value you wish to set
	 */
	public void setPtNumber(final Long ptNumber) {
		this.ptNumber = ptNumber;
	}

    /**
     * Return the value associated with the column: reserve.
	 * @return A Byte object (this.reserve)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Byte getReserve() {
		return this.reserve;
		
	}
	

  
    /**  
     * Set the value related to the column: reserve.
	 * @param reserve the reserve value you wish to set
	 */
	public void setReserve(final Byte reserve) {
		this.reserve = reserve;
	}

    /**
     * Return the value associated with the column: serviceCharge.
	 * @return A Double object (this.serviceCharge)
	 */
	@Basic( optional = false )
	@Column( name = "service_charge", nullable = false  )
	public Double getServiceCharge() {
		return this.serviceCharge;
		
	}
	

  
    /**  
     * Set the value related to the column: serviceCharge.
	 * @param serviceCharge the serviceCharge value you wish to set
	 */
	public void setServiceCharge(final Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Branch clone() throws CloneNotSupportedException {
		
        final Branch copy = (Branch)super.clone();

		copy.setAddress(this.getAddress());
		copy.setAdvanceInterest(this.getAdvanceInterest());
		copy.setArchive(this.isArchive());
		copy.setBalance(this.getBalance());
		copy.setCounter(this.getCounter());
		copy.setExtend(this.getExtend());
		copy.setId(this.getId());
		copy.setName(this.getName());
		copy.setOwner(this.getOwner());
		copy.setPtNumber(this.getPtNumber());
		copy.setReserve(this.getReserve());
		copy.setServiceCharge(this.getServiceCharge());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("address: " + this.getAddress() + ", ");
		sb.append("advanceInterest: " + this.getAdvanceInterest() + ", ");
		sb.append("archive: " + this.isArchive() + ", ");
		sb.append("balance: " + this.getBalance() + ", ");
		sb.append("counter: " + this.getCounter() + ", ");
		sb.append("extend: " + this.getExtend() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("name: " + this.getName() + ", ");
		sb.append("owner: " + this.getOwner() + ", ");
		sb.append("ptNumber: " + this.getPtNumber() + ", ");
		sb.append("reserve: " + this.getReserve() + ", ");
		sb.append("serviceCharge: " + this.getServiceCharge());
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
		
		final Branch that; 
		try {
			that = (Branch) proxyThat;
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
		result = result && (((getAddress() == null) && (that.getAddress() == null)) || (getAddress() != null && getAddress().equals(that.getAddress())));
		result = result && (((getAdvanceInterest() == null) && (that.getAdvanceInterest() == null)) || (getAdvanceInterest() != null && getAdvanceInterest().equals(that.getAdvanceInterest())));
		result = result && (((isArchive() == null) && (that.isArchive() == null)) || (isArchive() != null && isArchive().equals(that.isArchive())));
		result = result && (((getBalance() == null) && (that.getBalance() == null)) || (getBalance() != null && getBalance().equals(that.getBalance())));
		result = result && (((getCounter() == null) && (that.getCounter() == null)) || (getCounter() != null && getCounter().equals(that.getCounter())));
		result = result && (((getExtend() == null) && (that.getExtend() == null)) || (getExtend() != null && getExtend().equals(that.getExtend())));
		result = result && (((getName() == null) && (that.getName() == null)) || (getName() != null && getName().equals(that.getName())));
		result = result && (((getOwner() == null) && (that.getOwner() == null)) || (getOwner() != null && getOwner().equals(that.getOwner())));
		result = result && (((getPtNumber() == null) && (that.getPtNumber() == null)) || (getPtNumber() != null && getPtNumber().equals(that.getPtNumber())));
		result = result && (((getReserve() == null) && (that.getReserve() == null)) || (getReserve() != null && getReserve().equals(that.getReserve())));
		result = result && (((getServiceCharge() == null) && (that.getServiceCharge() == null)) || (getServiceCharge() != null && getServiceCharge().equals(that.getServiceCharge())));
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
					Byte newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null ) {
							newHashCode = getId();
						} else {
							newHashCode = (byte)super.hashCode();

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}
