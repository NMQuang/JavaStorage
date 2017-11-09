package com.quangnm21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quangnm21.dto.ChannelDto;
import com.quangnm21.entity.Channel;
import com.quangnm21.service.ChannelService;

@RestController
@RequestMapping("/channel")
public class ChannelAPI {

	@Autowired
	private ChannelService channelService;

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Channel> getChannel(@PathVariable("id") int id) {
		System.out.println("Fetching Channel with id " + id);
		Channel channel = channelService.getChannelById(id);
		if (channel == null) {
			System.out.println("Channel with id " + id + " not found");
			return new ResponseEntity<Channel>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Channel>(channel, HttpStatus.OK);
	}

	@RequestMapping(value = "/get-all-by-cate/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Channel>> getAllChannelById(@PathVariable("id") int id) {
		System.out.println("Fetching Channel with id " + id);
		List<Channel> channels = channelService.getAllChannelById(id);
		if (channels == null || channels.isEmpty()) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<List<Channel>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Channel>>(channels, HttpStatus.OK);
	}

	@RequestMapping(value = "/get-all-by-name/{Str}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Channel>> getAllChannelByStr(@PathVariable("Str") String str) {
		System.out.println("Fetching Channel with name " + str);
		List<Channel> channels = channelService.getAllChannelByName(str);
		if (channels == null || channels.isEmpty()) {
			System.out.println("User with name " + str + " not found");
			return new ResponseEntity<List<Channel>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Channel>>(channels, HttpStatus.OK);
	}

	@RequestMapping(value = "/get-dto/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ChannelDto> getChannelDto(@PathVariable("id") int id) {
		System.out.println("Fetching Channel with id " + id);
		ChannelDto channel = channelService.getChannelDtoById(id);
		if (channel == null) {
			System.out.println("Channel with id " + id + " not found");
			return new ResponseEntity<ChannelDto>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<ChannelDto>(channel, HttpStatus.OK);
	}
}
