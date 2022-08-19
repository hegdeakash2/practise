package com.vfislk.service;

import java.util.List;

import com.vfislk.training.DataPack;

public interface IDataService {
	
	public List<DataPack> getAll();
	public List<DataPack> getByBrand(String brand);
	public List<DataPack> getByType(String type);
	public List<DataPack> duration(int brand);
	public List<DataPack> getByPrice(double price);
	public DataPack getById(int id);
	

}
