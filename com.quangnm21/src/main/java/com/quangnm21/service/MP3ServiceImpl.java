package com.quangnm21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.dao.IMP3Dao;
import com.quangnm21.entity.MP3;

@Service
@Transactional
public class MP3ServiceImpl implements IMP3Service {

	@Autowired
	private IMP3Dao mp3Dao;
	@Override
	public List<MP3> getMP3ByCateId(int id) {
		return mp3Dao.getMP3ByCateId(id);
	}

	@Override
	public List<MP3> getMP3ByChannelId(int id) {
		return mp3Dao.getMP3ByCateId(id);
	}

}
