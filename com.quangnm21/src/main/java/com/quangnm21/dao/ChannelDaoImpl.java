package com.quangnm21.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.dto.ChannelDto;
import com.quangnm21.entity.Channel;
import com.quangnm21.util.HibernateUtil;

@Repository
@Transactional
public class ChannelDaoImpl implements ChannelDao {

	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public Channel getChannelById(int id) {
		return hibernateUtil.fetchById(id, Channel.class);
//		String query = "SELECT c.name, c.viewcount, c.status "
//				+ "FROM Channel c "
//				+ "WHERE c.id = " + id;
//		return hibernateUtil.fetchById(query);
	}

	@Override
	public List<Channel> getAllChannelByName(String str) {
		String query = "SELECT c FROM Channel c "
				+ "WHERE name LIKE " + "'" + str + "'";
		return hibernateUtil.fetchAll(query);
	}

	@Override
	public List<Channel> getAllChannelById(int id) {
		return hibernateUtil.fetchAllById(id, Channel.class);
	}

	@Override
	public ChannelDto getChannelDtoById(int id) {
		String query = "SELECT c.name, c.viewcount, c.status "
				+ "FROM Channel c "
				+ "WHERE c.id = " + id;
		return hibernateUtil.fetchById(query);
	}

}
