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
				+ "LEFT outer  JOIN m.store s "
				+ "LEFT outer  JOIN s.channel c "
				+ "LEFT outer  JOIN c.category ca "
				+ "WHERE ca.id = 1";

		return hibernateUtil.fetchAll(query);
	}

	@Override
	public List<MP3> getMP3ByChannelId(int id) {
		String query = "SELECT m FROM MP3 m "
				+ "LEFT JOIN m.store s "
				+ "LEFT JOIN s.channel c "
				+ "WHERE c.id = " +id;
		return hibernateUtil.fetchAll(query);
	}

}
