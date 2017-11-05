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

import com.quangnm21.entity.Channel;
import com.quangnm21.service.IChannelService;


@RestController
@RequestMapping("/channel")
public class ChannelRest {

	@Autowired
	private IChannelService channelService;

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Channel> getChannel(@PathVariable("id") int id) {
		System.out.println("Fetching Channel with id " + id);
		Channel channel = channelService.getChannelById(id);
		if (channel == null) {
			System.out.println("Channel with id " + id + " not found");
			return new ResponseEntity<Channel>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Channel>(channel, HttpStatus.OK);
	}

	@RequestMapping(value = "/getAll/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Channel>> getAllChannel(@PathVariable("id") int id) {
		System.out.println("Fetching Channel with id " + id);
		List<Channel> channel = channelService.getAllChannelById(id);
		if (channel.isEmpty()) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<List<Channel>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Channel>>(channel, HttpStatus.OK);
	}

	@RequestMapping(value = "/channel/{str}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<List<Channel>> getChannel(@PathVariable("str") String str) {
	        System.out.println("Fetching ChannList<Channel>el with id " + str);
	        List<Channel> channel = channelService.findByName(str);
	        if (channel == null) {
	            System.out.println("User with str " + str + " not found");
	            return new ResponseEntity<List<Channel>>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<List<Channel>>(channel, HttpStatus.OK);
	    }
}
