package com.quangnm21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.dao.ChannelDao;
import com.quangnm21.dto.ChannelDto;
import com.quangnm21.entity.Channel;


@Service
@Transactional
public class ChannelServiceImpl implements ChannelService {

	@Autowired
	private ChannelDao channelDao;

	@Override
	public Channel getChannelById(int id) {
		return channelDao.getChannelById(id);
	}

	@Override
	public List<Channel> getAllChannelById(int id) {
		return channelDao.getAllChannelById(id);
	}

	@Override
	public List<Channel> getAllChannelByName(String str) {
		return channelDao.getAllChannelByName(str);
	}

	@Override
	public ChannelDto getChannelDtoById(int id) {
		return channelDao.getChannelDtoById(id);
	}
}
