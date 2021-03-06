package com.prenda.model.dao.prenda.impl;

import com.github.wwadge.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.prenda.model.obj.prenda.Level;
import org.springframework.stereotype.Repository;
import com.prenda.model.dao.prenda.LevelDao;
 
 
/**
 * DAO for table: Level.
 * @author autogenerated
 */
@Repository
public class LevelDaoImpl extends GenericHibernateDaoImpl<Level, Byte> implements LevelDao {
	
	/** Constructor method. */
		public LevelDaoImpl() {
			super(Level.class);
		}
	}

