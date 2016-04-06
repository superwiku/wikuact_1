package org.meruvian.yama.webapi.service.contributtor;

import java.util.List;

import javax.inject.Inject;

import org.meruvian.yama.tot.contributtor.Address;
import org.meruvian.yama.tot.contributtor.AddressRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class RestAddressService implements AddressService {
	@Inject
	private AddressRepository addressRepository;
	
	@Override
	public Address getAddressByNation(String nation) {
		return addressRepository.findByNation(nation);
	}

	
	@Override
	@Transactional
	public Address saveAddress(Address address) {			
		return addressRepository.save(address);
	}

	@Override
	@Transactional
	public Address updateAddress(String nation, Address address) {
		Address ori = getAddressByNation(address.getNation());
		if (ori != null) {
			ori.setNation(address.getNation());
		}
		
		return ori;
	}

	@Override
	@Transactional
	public void deleteAddress(String nation) {
		addressRepository.delete(nation);
	}

}
