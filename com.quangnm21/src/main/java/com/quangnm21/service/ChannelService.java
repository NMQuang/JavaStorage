package com.quangnm21.service;

import java.util.List;

import com.quangnm21.dto.ChannelDto;
import com.quangnm21.entity.Channel;

public interface ChannelService {

	Channel getChannelById(int id);

	ChannelDto getChannelDtoById(int id);

	List<Channel> getAllChannelById(int id);

	List<Channel>  getAllChannelByName(String str);
}
