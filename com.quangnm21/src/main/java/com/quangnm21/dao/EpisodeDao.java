package com.quangnm21.dao;

import java.util.List;

import com.quangnm21.entity.Episode;

public interface EpisodeDao {

	List<Episode> getAllEpisodeByCategory(int id);

	List<Episode> getAllEpisodeByChannel(int id);
}
