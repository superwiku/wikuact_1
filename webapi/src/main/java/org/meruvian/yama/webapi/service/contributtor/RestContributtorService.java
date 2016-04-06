package org.meruvian.yama.webapi.service.contributtor;

import java.util.List;

import javax.inject.Inject;

import org.meruvian.yama.tot.contributtor.Contributtor;
import org.meruvian.yama.tot.contributtor.ContributtorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class RestContributtorService implements ContributtorService {
	@Inject
	private ContributtorRepository contributtorRepository;
	
	@Override
	public Contributtor getContributtorById(long id) {
		return contributtorRepository.findById(id);
	}

	@Override
	public List<Contributtor> findContributtorByName(String name) {
		return contributtorRepository.findByName(name);
	}

	@Override
	@Transactional
	public Contributtor saveContributtor(Contributtor contributtor) {
		contributtor.setId(0);
			
		return contributtorRepository.save(contributtor);
	}

	@Override
	@Transactional
	public Contributtor updateContributtor(long id, Contributtor contributtor) {
		Contributtor ori = getContributtorById(contributtor.getId());
		if (ori != null) {
			ori.setId(contributtor.getId());
			ori.setName(contributtor.getName());
			ori.setAddress(contributtor.getAddress());
			ori.setBirthdate(contributtor.getBirthdate());
		}
		
		return ori;
	}

	@Override
	@Transactional
	public void deleteContributtor(long id) {
		contributtorRepository.delete(id);
	}

}
