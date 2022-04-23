package tco.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tco.model.Pastel;
import tco.repositories.PastelRepository;

@Service
public class PastelServiceImpl implements PastelService{
	
	@Autowired
	private PastelRepository pastelRepository;

	@Override
	public List<Pastel> findAll() {
		return pastelRepository.findAll();
	}

	@Override
	public Optional<Pastel> findById(Long id) {
		return pastelRepository.findById(id);
	}

	@Override
	public List<Pastel> ranking() {
		return pastelRepository.ranking();
	}

	@Override
	public List<Pastel> buscar(String nombre) {
		return pastelRepository.buscar(nombre);
	}

	@Override
	public List<Pastel> buscarCategoria(Long id) {
		return pastelRepository.buscarCategoria(id);
	}
	


}
