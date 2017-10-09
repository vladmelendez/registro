package com.stratega.service;

import java.util.List;

import com.stratega.to.SedeTO;
import com.stratega.to.TipoParticipanteTO;

public interface CatalogoService {
	List<TipoParticipanteTO> cargaTiposParticipante();
	List<SedeTO> cargaSedes();

}
