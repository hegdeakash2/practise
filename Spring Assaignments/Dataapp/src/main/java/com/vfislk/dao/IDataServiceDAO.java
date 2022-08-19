package com.vfislk.dao;

import java.util.List;

import com.vfislk.training.DataPack;

public interface IDataServiceDAO {
	public List<DataPack> findAll();
	public List<DataPack> findByBrand(String brand);
	public List<DataPack> findByType(String type);
	public List<DataPack> findByDuration(int duration);
	public List<DataPack> findByPrice(double price);
	 DataPack findById(int id);

}
