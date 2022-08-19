package com.datapack.service;

import java.util.List;

import com.datapack.model.DataPack;

public interface IDataPackService {
	public List<DataPack> getAll();
	public List<DataPack> getByType();
	public List<DataPack> duration();
	

}
