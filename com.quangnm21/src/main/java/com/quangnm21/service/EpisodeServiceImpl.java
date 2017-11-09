package com.quangnm21.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.dao.EpisodeDao;
import com.quangnm21.entity.Episode;


@Service
@Transactional
public class EpisodeServiceImpl implements EpisodeService {

	@Autowired
	private EpisodeDao episodeDao;

	@Override
	public List<Episode> getAllEpisodeByCategory(int id) {
		List<Episode> episodes = episodeDao.getAllEpisodeByCategory(id);

		if (episodes == null || episodes.isEmpty()) {
			return null;
		}
		return episodes;
	}

	@Override
	public List<Episode> getAllEpisodeByChannel(int id) {
		List<Episode> episodes = episodeDao.getAllEpisodeByChannel(id);

		if (episodes == null || episodes.isEmpty()) {
			return null;
		}
		return episodes;
	}
}
