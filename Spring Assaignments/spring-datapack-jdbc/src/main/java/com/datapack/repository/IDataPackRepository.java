package com.datapack.repository;

import java.util.List;

import com.datapack.model.DataPack;

public interface IDataPackRepository {
	
	public List<DataPack> findAll();
	public List<DataPack> findByType();
	public List<DataPack> duration();


}
