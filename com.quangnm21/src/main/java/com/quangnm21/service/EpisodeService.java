package com.quangnm21.service;

import java.util.List;

import com.quangnm21.entity.Episode;

public interface EpisodeService {

	 List<Episode> getAllEpisodeByCategory(int id);

	 List<Episode> getAllEpisodeByChannel(int id);
}
