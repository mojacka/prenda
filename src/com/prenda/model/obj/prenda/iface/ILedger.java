package com.prenda.model.obj.prenda.iface;
import java.util.Date;
import javax.persistence.Basic;


/** 
 * Object interface mapping for hibernate-handled table: ledger.
 * @author autogenerated
 */

public interface ILedger {



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
     * Return the value associated with the column: ledgerDate.
	 * @return A Date object (this.ledgerDate)
	 */
	Date getLedgerDate();
	

  
    /**  
     * Set the value related to the column: ledgerDate.
	 * @param ledgerDate the ledgerDate value you wish to set
	 */
	void setLedgerDate(final Date ledgerDate);

	// end of interface
}