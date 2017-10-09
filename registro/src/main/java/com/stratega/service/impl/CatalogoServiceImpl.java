package com.stratega.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stratega.dao.CatalogoDao;
import com.stratega.service.CatalogoService;
import com.stratega.to.SedeTO;
import com.stratega.to.TipoParticipanteTO;

@Service
public class CatalogoServiceImpl implements CatalogoService{
	@Autowired
    private CatalogoDao catalogoDao;

	public List<TipoParticipanteTO> cargaTiposParticipante() {
		return catalogoDao.cargaTiposParticipante();
	}
	
	public List<SedeTO> cargaSedes() {
		return catalogoDao.cargaSedes();
	}
}
