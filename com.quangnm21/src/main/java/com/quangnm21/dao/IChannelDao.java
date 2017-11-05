package com.quangnm21.dao;

import java.util.List;

import com.quangnm21.entity.Channel;


public interface IChannelDao {

	Channel getChannelById(int id);

	List<Channel> getAllChannelById(int id);

	List<Channel>  getAllChannelByName(String str);
}
