package com.hosto.service;

import java.util.List;

import com.hosto.models.Req;

public interface IReqService {
	

    public List<Req> listarTodos();
	public void guardar(Req req);
	public Req buscarPorId(Long  id);
	public void eliminar(Long id);
	//public List<Empresa> findAllByQuery(String palabraClave);

}
