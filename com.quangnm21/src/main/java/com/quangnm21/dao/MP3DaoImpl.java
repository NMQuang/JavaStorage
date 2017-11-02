package com.quangnm21.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.entity.MP3;
import com.quangnm21.util.HibernateUtil;


@Repository
@Transactional
public class MP3DaoImpl implements IMP3Dao {

	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public List<MP3> getMP3ByCateId(int id) {
		String query ="SELECT m FROM MP3 m "
				+ "JOIN m.store s "
				+ "JOIN s.channel c "
				+ "JOIN c.category "
				+ "WHERE c.id =  " +id;

		return hibernateUtil.fetchAll(query);
	}

}
