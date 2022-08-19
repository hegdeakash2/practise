package com.vfislk.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vfislk.training.DataPack;

@Component
public class DataServiceImpl implements IDataServiceDAO {

	@Override
	public List<DataPack> findAll() {
		
	return showDetails();
		
	}

	@Override
	public List<DataPack> findByBrand(String brand) {
		
		return showDetails().stream().filter((DataPack p1)->p1.getBrand().equals(brand)).collect(Collectors.toList());
	}

	@Override
	public List<DataPack> findByType(String type) {
		return showDetails().stream().filter((DataPack p1)->p1.getType().equals(type)).collect(Collectors.toList());
	}

	@Override
	public List<DataPack> findByDuration(int duration) {
		return showDetails().stream().filter((DataPack p1)->p1.getType().equals(duration)).collect(Collectors.toList());
	}

	@Override
	public List<DataPack> findByPrice(double price) {
		return showDetails().stream().filter((DataPack p1)->p1.getType().equals(price)).collect(Collectors.toList());
	}

	@Override
	public DataPack findById(int id) {
	
		return showDetails().stream().findFirst().get();
	}

private List<DataPack>showDetails(){
		
		return Arrays.asList( 
				
	
			
	new DataPack("airtel","prepaid",3,700,23),
	new DataPack("airtel","postpaid",3,1000,28),
	new DataPack("idea","prepaid",6,700,45),
	new DataPack("bsnl","postpaid",3,600,56),
	new DataPack("jio","prepaid",3,500,32),
	new DataPack("vi","prepaid",6,900,25),
		new DataPack("bsnl","prepaid",9, 1200,49)
		);
}
	
	

}
