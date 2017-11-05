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

import com.quangnm21.entity.MP3;
import com.quangnm21.service.IMP3Service;


@RestController
@RequestMapping("/mp3")
public class MP3Rest {

	@Autowired
	private IMP3Service mp3Service;

	@RequestMapping(value = "/getByCate/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<List<MP3>> getMP3ByCateId(@PathVariable("id") int id) {
	        System.out.println("Fetching User with id " + id);
	        List<MP3> mp3 = mp3Service.getMP3ByCateId(id);
	        if (mp3.isEmpty()) {
	            System.out.println("User with id " + id + " not found");
	            return new ResponseEntity< List<MP3>>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity< List<MP3>>(mp3, HttpStatus.OK);
	    }

	@RequestMapping(value = "/getByChannel/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<List<MP3>> getMP3ByChannelId(@PathVariable("id") int id) {
	        System.out.println("Fetching User with id " + id);
	        List<MP3> mp3 = mp3Service.getMP3ByChannelId(id);
	        if (mp3.isEmpty()) {
	            System.out.println("User with id " + id + " not found");
	            return new ResponseEntity< List<MP3>>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity< List<MP3>>(mp3, HttpStatus.OK);
	    }
}
