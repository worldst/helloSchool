package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Offer;
import kr.ac.hansung.service.OfferService;

@Controller
public class OfferController {
	
	@Autowired
	private OfferService offerService;
	
	@RequestMapping("/offers")
	public String showOffers(Model model) {
		List<Offer> offers = offerService.getCurrent();
		model.addAttribute("offers",offers);
		
		return "offers";
	}
	
	@RequestMapping("/insertInfo")
	public String insertInfo(Model model) {
		List<Offer> offers = offerService.getPerson();
		model.addAttribute("insertInfo",offers);
		
		return "insertInfo";
	}
	
	@RequestMapping("/offerstwo")
	public String showOffers2(Model model) {
		List<Offer> offers = offerService.getCurrent2();
		model.addAttribute("offerstwo",offers);
		List<Offer> offers2 = offerService.getCurrent3();
		model.addAttribute("offerstwo2",offers2);
		return "offerstwo";
	}
	
	@RequestMapping("/detail")
	public String showOffersDetail(Model model) {
		List<Offer> offers = offerService.getCurrentDetail();
		model.addAttribute("detail",offers);
		
		return "detail";
	}
	
	@RequestMapping("/detail2")
	public String showOffersDetail2(Model model) {
		List<Offer> offers = offerService.getCurrentDetail2();
		model.addAttribute("detail2",offers);
		
		return "detail2";
	}
	
	@RequestMapping("/detail3")
	public String showOffersDetail3(Model model) {
		List<Offer> offers = offerService.getCurrentDetail3();
		model.addAttribute("detail3",offers);
		
		return "detail3";
	}
	
	@RequestMapping("/detail4")
	public String showOffersDetail4(Model model) {
		List<Offer> offers = offerService.getCurrentDetail4();
		model.addAttribute("detail4",offers);
		
		return "detail4";
	}
	
	@RequestMapping("/detail5")
	public String showOffersDetail5(Model model) {
		List<Offer> offers = offerService.getCurrentDetail5();
		model.addAttribute("detail5",offers);
		
		return "detail5";
	}
	
	@RequestMapping("/detail6")
	public String showOffersDetail6(Model model) {
		List<Offer> offers = offerService.getCurrentDetail6();
		model.addAttribute("detail6",offers);
		
		return "detail6";
	}
	
	@RequestMapping("/detail7")
	public String showOffersDetail7(Model model) {
		List<Offer> offers = offerService.getCurrentDetail7();
		model.addAttribute("detail7",offers);
		
		return "detail7";
	}
	
	@RequestMapping("/createoffer")
	public String createOffer(Model model) {
		model.addAttribute("offer", new Offer());
		return "createoffer";
	}
	

	
	@RequestMapping("/docreate")
	public String doCreate(Model model, Offer offer) {
		
		
		offerService.insert(offer);
		return "offercreated";
	}
	
	
}
