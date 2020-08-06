package pe.edu.upeu.ruos.daoimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.ruos.dao.RuosDao;
import pe.edu.upeu.ruos.entity.Usuario;

@Repository
public class RuosDaoImp implements RuosDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub

return jdbcTemplate.query("select *from usuario" , BeanPropertyRowMapper.newInstance(Usuario.class));
	}

	@Override
	public int create(Usuario cli) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int edit(Usuario cli) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
