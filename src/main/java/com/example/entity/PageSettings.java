package com.example.entity;

import org.springframework.stereotype.Component;

@Component
public class PageSettings {

	private int page = 0;

	private int elementsPerPage = 2;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getElementPerPage() {
		return elementsPerPage;
	}

	public void setElementPerPage(int elementPerPage) {
		this.elementsPerPage = elementPerPage;
	}

//    private String sortDirection = "dsc";
//
//    private String key;
//
//    public Sort buildSort() {
//        switch (direction) {
//            case "dsc":
//                return Sort.by(key).descending();
//            case "asc":
//                return Sort.by(key).ascending();
//            default:
//                log.warn("Invalid direction provided in PageSettings, using descending direction as default value");
//                return Sort.by(key).descending();
//        }
//	}
}
