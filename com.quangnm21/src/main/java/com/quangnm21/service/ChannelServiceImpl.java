package com.quangnm21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.dao.IChannelDao;
import com.quangnm21.entity.Channel;


@Service
@Transactional
public class ChannelServiceImpl implements IChannelService {

	@Autowired
	private IChannelDao channelDao;

	@Override
	public Channel getChannelById(int id) {
		return channelDao.getChannelById(id);
	}

	@Override
	public List<Channel> getAllChannelById(int id) {
		return channelDao.getAllChannelById(id);
	}

	public List<Channel> findByName(String str) {
		return channelDao.getAllChannelByName(str);
	}
}
