package com.hosto.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.models.Usuario;
import com.hosto.repository.UsuarioRepository;
import com.hosto.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private UsuarioRepository usuariorepository;

	@Override
	public List<Usuario> listarTodos() {
		
		return usuariorepository.findAll();
	}

	@Override
	public void guardarReq(Usuario usuario) {
		
		
	}

	@Override
	public Usuario buscarPorId(Long id) {
	
		return null;
	}

	@Override
	public void eliminar(Long id) {
	
		
	}

}
