package com.quangnm21.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.entity.Episode;
import com.quangnm21.util.HibernateUtil;

@Repository
@Transactional
public class EpisodeDaoImpl implements EpisodeDao {

	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public List<Episode> getAllEpisodeByCategory(int id) {
		String query = "SELECT e FROM Episode e "
				+ "LEFT OUTER JOIN e.channel c "
				+ "LEFT OUTER JOIN c.categories ca "
				+ "WHERE ca.id = " + id;
		return hibernateUtil.fetchAll(query);
	}

	@Override
	public List<Episode> getAllEpisodeByChannel(int id) {
		String query = "SELECT e FROM Episode e "
				+ "LEFT OUTER JOIN e.channel c "
				+ "WHERE c.id = " + id;
		return hibernateUtil.fetchAll(query);
	}


}
