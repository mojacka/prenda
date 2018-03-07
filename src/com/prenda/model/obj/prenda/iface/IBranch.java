package com.prenda.model.obj.prenda.iface;
import javax.persistence.Basic;


/** 
 * Object interface mapping for hibernate-handled table: branch.
 * @author autogenerated
 */

public interface IBranch {



    /**
     * Return the value associated with the column: address.
	 * @return A String object (this.address)
	 */
	String getAddress();
	

  
    /**  
     * Set the value related to the column: address.
	 * @param address the address value you wish to set
	 */
	void setAddress(final String address);

    /**
     * Return the value associated with the column: advanceInterest.
	 * @return A Double object (this.advanceInterest)
	 */
	Double getAdvanceInterest();
	

  
    /**  
     * Set the value related to the column: advanceInterest.
	 * @param advanceInterest the advanceInterest value you wish to set
	 */
	void setAdvanceInterest(final Double advanceInterest);

    /**
     * Return the value associated with the column: archive.
	 * @return A Boolean object (this.archive)
	 */
	Boolean isArchive();
	

  
    /**  
     * Set the value related to the column: archive.
	 * @param archive the archive value you wish to set
	 */
	void setArchive(final Boolean archive);

    /**
     * Return the value associated with the column: balance.
	 * @return A Double object (this.balance)
	 */
	Double getBalance();
	

  
    /**  
     * Set the value related to the column: balance.
	 * @param balance the balance value you wish to set
	 */
	void setBalance(final Double balance);

    /**
     * Return the value associated with the column: counter.
	 * @return A Byte object (this.counter)
	 */
	Byte getCounter();
	

  
    /**  
     * Set the value related to the column: counter.
	 * @param counter the counter value you wish to set
	 */
	void setCounter(final Byte counter);

    /**
     * Return the value associated with the column: extend.
	 * @return A Byte object (this.extend)
	 */
	Byte getExtend();
	

  
    /**  
     * Set the value related to the column: extend.
	 * @param extend the extend value you wish to set
	 */
	void setExtend(final Byte extend);

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
	Integer getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Integer id);

    /**
     * Return the value associated with the column: name.
	 * @return A String object (this.name)
	 */
	String getName();
	

  
    /**  
     * Set the value related to the column: name.
	 * @param name the name value you wish to set
	 */
	void setName(final String name);

    /**
     * Return the value associated with the column: owner.
	 * @return A Byte object (this.owner)
	 */
	Byte getOwner();
	

  
    /**  
     * Set the value related to the column: owner.
	 * @param owner the owner value you wish to set
	 */
	void setOwner(final Byte owner);

    /**
     * Return the value associated with the column: ptNumber.
	 * @return A Long object (this.ptNumber)
	 */
	Long getPtNumber();
	

  
    /**  
     * Set the value related to the column: ptNumber.
	 * @param ptNumber the ptNumber value you wish to set
	 */
	void setPtNumber(final Long ptNumber);

    /**
     * Return the value associated with the column: reserve.
	 * @return A Byte object (this.reserve)
	 */
	Byte getReserve();
	

  
    /**  
     * Set the value related to the column: reserve.
	 * @param reserve the reserve value you wish to set
	 */
	void setReserve(final Byte reserve);

    /**
     * Return the value associated with the column: serviceCharge.
	 * @return A Double object (this.serviceCharge)
	 */
	Double getServiceCharge();
	

  
    /**  
     * Set the value related to the column: serviceCharge.
	 * @param serviceCharge the serviceCharge value you wish to set
	 */
	void setServiceCharge(final Double serviceCharge);

	// end of interface
}