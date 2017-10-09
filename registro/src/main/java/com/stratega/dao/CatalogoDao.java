package com.stratega.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.stratega.to.SedeTO;
import com.stratega.to.TipoParticipanteTO;

@Repository
public class CatalogoDao {
	private static final Log logger = LogFactory.getLog(CatalogoDao.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<TipoParticipanteTO> cargaTiposParticipante() {
		List<TipoParticipanteTO>tiposParticipante = null;
		String sql = 
			"SELECT * " +
			"FROM cattipoparticipante " +
			"WHERE idStatus = 1 " +
			"ORDER BY descripcion";
		try {
			tiposParticipante = (List<TipoParticipanteTO>)jdbcTemplate.query(sql,
					BeanPropertyRowMapper.newInstance((TipoParticipanteTO.class)));
		} catch (Exception e) {
			logger.error("Error al consultar: " + e);
		}
		return tiposParticipante; 
	}
	
	public List<SedeTO> cargaSedes() {
		List<SedeTO> sedes = null;
		String sql = 
			"SELECT * " +
			"FROM catsede " +
			"WHERE idStatus = 1 " +
			"ORDER BY descripcion";
		try {
			sedes = (List<SedeTO>)jdbcTemplate.query(sql,
					BeanPropertyRowMapper.newInstance((SedeTO.class)));
			} catch (Exception e) {
			logger.error("Error al consultar sedes: " + e);
		}
		return sedes; 
	}
}
