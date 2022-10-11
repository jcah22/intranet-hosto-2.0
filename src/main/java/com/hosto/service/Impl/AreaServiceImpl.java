package com.hosto.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.models.Area;
import com.hosto.repository.AreaRepository;
import com.hosto.service.IAreaService;

@Service
public class AreaServiceImpl implements IAreaService {
	
	@Autowired
	private AreaRepository arearepository;

	@Override
	public List<Area> listarTodos() {
		// TODO Auto-generated method stub
		return arearepository.findAll();
	}

	@Override
	public void guardar(Area area) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Area buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
