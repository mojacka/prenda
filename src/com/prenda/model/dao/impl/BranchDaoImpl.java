package com.prenda.model.dao.impl;

import com.github.wwadge.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.prenda.model.obj.Branch;

import org.springframework.stereotype.Repository;

import com.prenda.model.dao.BranchDao;
 
 
/**
 * DAO for table: Branch.
 * @author autogenerated
 */
@Repository
public class BranchDaoImpl extends GenericHibernateDaoImpl<Branch, Byte> implements BranchDao {
	
	/** Constructor method. */
		public BranchDaoImpl() {
			super(Branch.class);
		}
	}

