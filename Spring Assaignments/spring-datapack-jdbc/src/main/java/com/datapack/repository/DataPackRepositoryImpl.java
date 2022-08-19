package com.datapack.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class DataPackRepositoryImpl implements IDataPackRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<com.datapack.model.DataPack> findAll() {
		
		return null;
	}

	@Override
	public List<com.datapack.model.DataPack> findByType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<com.datapack.model.DataPack> duration() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
