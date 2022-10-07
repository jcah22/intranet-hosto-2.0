package com.hosto.service;

import java.util.List;

import com.hosto.models.Odc;

public interface IOdcService {
	

    public List<Odc> listarTodos();
	public void guardar(Odc odc);
	public Odc buscarPorId(Long  id);
	public void eliminar(Long id);
	public List<Odc> findAllByQuery(int palabraClave);

}
