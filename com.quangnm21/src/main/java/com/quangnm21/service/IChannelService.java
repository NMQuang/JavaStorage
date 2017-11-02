package com.quangnm21.service;

import java.util.List;

import com.quangnm21.entity.Channel;


public interface IChannelService {

	Channel getChannelById(int id);

	List<Channel> getAllChannelById(int id);
}
