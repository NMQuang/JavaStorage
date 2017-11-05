package com.quangnm21.service;

import java.util.List;

import com.quangnm21.entity.MP3;

public interface IMP3Service {

	List<MP3> getMP3ByCateId(int id);

	List<MP3> getMP3ByChannelId(int id);
}
