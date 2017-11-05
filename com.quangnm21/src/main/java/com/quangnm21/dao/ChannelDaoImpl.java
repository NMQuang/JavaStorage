package com.quangnm21.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.entity.Channel;
import com.quangnm21.util.HibernateUtil;


@Repository
@Transactional
public class ChannelDaoImpl implements IChannelDao {

	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public Channel getChannelById(int id) {
		return hibernateUtil.fetchById(id, Channel.class);
	}

	@Override
	public List<Channel> getAllChannelByName(String str) {
		return hibernateUtil.fetchAllByName(str, Channel.class);
	}

	@Override
	public List<Channel> getAllChannelById(int id) {
		return hibernateUtil.fetchAllById(id, Channel.class);
	}

}
