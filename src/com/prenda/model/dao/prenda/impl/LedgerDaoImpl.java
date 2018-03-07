package com.prenda.model.dao.prenda.impl;

import com.github.wwadge.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.prenda.model.obj.prenda.Ledger;
import org.springframework.stereotype.Repository;
import com.prenda.model.dao.prenda.LedgerDao;
 
 
/**
 * DAO for table: Ledger.
 * @author autogenerated
 */
@Repository
public class LedgerDaoImpl extends GenericHibernateDaoImpl<Ledger, Long> implements LedgerDao {
	
	/** Constructor method. */
		public LedgerDaoImpl() {
			super(Ledger.class);
		}
	}
