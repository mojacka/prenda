package com.prenda.model.obj.prenda.iface;
import java.util.Date;
import javax.persistence.Basic;


/** 
 * Object interface mapping for hibernate-handled table: pullout.
 * @author autogenerated
 */

public interface IPullout {



    /**
     * Return the value associated with the column: auction.
	 * @return A Boolean object (this.auction)
	 */
	Boolean isAuction();
	

  
    /**  
     * Set the value related to the column: auction.
	 * @param auction the auction value you wish to set
	 */
	void setAuction(final Boolean auction);

    /**
     * Return the value associated with the column: createDate.
	 * @return A Date object (this.createDate)
	 */
	Date getCreateDate();
	

  
    /**  
     * Set the value related to the column: createDate.
	 * @param createDate the createDate value you wish to set
	 */
	void setCreateDate(final Date createDate);

    /**
     * Return the value associated with the column: encoder.
	 * @return A String object (this.encoder)
	 */
	String getEncoder();
	

  
    /**  
     * Set the value related to the column: encoder.
	 * @param encoder the encoder value you wish to set
	 */
	void setEncoder(final String encoder);

    /**
     * Return the value associated with the column: id.
	 * @return A Long object (this.id)
	 */
	Long getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Long id);

    /**
     * Return the value associated with the column: pulloutDate.
	 * @return A Date object (this.pulloutDate)
	 */
	Date getPulloutDate();
	

  
    /**  
     * Set the value related to the column: pulloutDate.
	 * @param pulloutDate the pulloutDate value you wish to set
	 */
	void setPulloutDate(final Date pulloutDate);

    /**
     * Return the value associated with the column: username.
	 * @return A String object (this.username)
	 */
	String getUsername();
	

  
    /**  
     * Set the value related to the column: username.
	 * @param username the username value you wish to set
	 */
	void setUsername(final String username);

	// end of interface
}