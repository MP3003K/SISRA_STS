package pe.edu.upeu.ruos.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.ruos.dao.RuosDao;
import pe.edu.upeu.ruos.entity.Usuario;
import pe.edu.upeu.ruos.service.RuosService;

@Service
public class RuosServiceImp implements RuosService {
	@Autowired
	private RuosDao ruosDao;

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return ruosDao.readAll();
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
