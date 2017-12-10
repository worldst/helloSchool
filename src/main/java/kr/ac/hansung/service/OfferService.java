package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.OfferDAO;
import kr.ac.hansung.model.Offer;


@Service
public class OfferService {

	@Autowired
	private OfferDAO offerDao;

	public List<Offer> getCurrent() {

		return offerDao.getOffers();
	}
	
	public List<Offer> getPerson() {

		return offerDao.getOffers10();
	}

	public List<Offer> getCurrent2() {

		return offerDao.getOffers2();
	}
	
	public List<Offer> getCurrent3() {

		return offerDao.getOffers3();
	}
	
	public List<Offer> getCurrentDetail() {

		return offerDao.getOffersdetail();
	}
	
	public List<Offer> getCurrentDetail2() {

		return offerDao.getOffersdetail2();
	}
	
	public List<Offer> getCurrentDetail3() {

		return offerDao.getOffersdetail3();
	}
	
	public List<Offer> getCurrentDetail4() {

		return offerDao.getOffersdetail4();
	}
	
	public List<Offer> getCurrentDetail5() {

		return offerDao.getOffersdetail5();
	}
	
	public List<Offer> getCurrentDetail6() {

		return offerDao.getOffersdetail6();
	}
	
	public List<Offer> getCurrentDetail7() {

		return offerDao.getOffersdetail7();
	}

	
	  public void insert(Offer offer) { 
		  offerDao.insert(offer);
	  }
	  
	 
}
