package com.vfislk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vfislk.dao.IDataServiceDAO;
import com.vfislk.training.DataPack;
@Component

public class DataServiceImpl implements IDataService {
	@Autowired
	IDataServiceDAO idataService;
	
	@Override
	public List<DataPack> getAll() {
		List<DataPack> data =idataService.findAll();
		return data;
	}

	@Override
	public List<DataPack> getByBrand(String brand) {
		List<DataPack> data =idataService.findByBrand(brand);
		return data;
	}

	@Override
	public List<DataPack> getByType(String type) {
		List<DataPack> data =idataService.findByType(type);
		return data;
	}

	@Override
	public List<DataPack> duration(int brand) {
		List<DataPack> data =idataService.findByDuration(brand);
		return data;
	}

	@Override
	public List<DataPack> getByPrice(double price) {
		List<DataPack> data =idataService.findByPrice(price);
		return data;
	}

	@Override
	public DataPack getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
