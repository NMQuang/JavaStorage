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

import com.quangnm21.entity.Episode;
import com.quangnm21.service.EpisodeService;

@RestController
@RequestMapping("/episode")
public class EpisodeAPI {

	@Autowired
	private EpisodeService episodeService;

	@RequestMapping(value = "/get-by-cate/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Episode>> getEpisodeByCategory(@PathVariable("id") int id) {

		 System.out.println("Fetching Category with id " + id);
		List<Episode> episodes = episodeService.getAllEpisodeByCategory(id);
		if (episodes == null || episodes.isEmpty()) {
			System.out.println("Episode with id " + id + " not found");
			return new ResponseEntity< List<Episode>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity< List<Episode>>(episodes, HttpStatus.OK);
	}

	@RequestMapping(value = "/get-by-channel/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Episode>> getEpisodeByChannel(@PathVariable("id") int id) {

		 System.out.println("Fetching Channel with id " + id);
		List<Episode> episodes = episodeService.getAllEpisodeByChannel(id);
		if (episodes == null || episodes.isEmpty()) {
			System.out.println("Episode with id " + id + " not found");
			return new ResponseEntity< List<Episode>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity< List<Episode>>(episodes, HttpStatus.OK);
	}
}
