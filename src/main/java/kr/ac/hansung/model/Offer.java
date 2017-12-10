package kr.ac.hansung.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor

public class Offer {
	
	private int year;
	private int semester;
	private String code;
	private String name;
	private String etc;
	private int num;
	
	
}
