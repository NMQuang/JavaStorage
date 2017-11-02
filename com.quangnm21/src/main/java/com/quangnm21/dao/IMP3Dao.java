package com.quangnm21.dao;

import java.util.List;

import com.quangnm21.entity.MP3;


public interface IMP3Dao {

	List<MP3> getMP3ByCateId(int id);
}
