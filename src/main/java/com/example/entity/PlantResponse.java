package com.example.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PlantResponse {

	private List<Plant> content;
	private int pageNo;
	private int elementsPerPage;
	private long totalElements;
	private int totalPages;
	private boolean last;

	public PlantResponse() {
		super();
	}

	public PlantResponse(List<Plant> content, int pageNo, int elementsPerPage, long totalElements, int totalPages,
			boolean last) {
		super();
		this.content = content;
		this.pageNo = pageNo;
		this.elementsPerPage = elementsPerPage;
		this.totalElements = totalElements;
		this.totalPages = totalPages;
		this.last = last;
	}

	public List<Plant> getContent() {
		return content;
	}

	public void setContent(List<Plant> content) {
		this.content = content;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getElementsPerPage() {
		return elementsPerPage;
	}

	public void setElementsPerPage(int elementsPerPage) {
		this.elementsPerPage = elementsPerPage;
	}

	public long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

}
