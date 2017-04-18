package com.cawt.model;

import javax.persistence.Embeddable;

@Embeddable
public class HikeSection {

	private String start;
	private String end;

	
	public HikeSection() {
		// TODO Auto-generated constructor stub
	}

	
	public HikeSection(String start, String end) {
		super();
		this.start = start;
		this.end = end;
	}


	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "HikeSection [start=" + start + ", end=" + end + "]";
	}

}
