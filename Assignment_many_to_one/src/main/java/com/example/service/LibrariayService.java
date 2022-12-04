package com.example.service;

import org.springframework.stereotype.Component;

import com.example.entity.Library;

@Component
public interface LibrariayService {
	  public Library saveLibrary(Library l);
	 public Library findByLibraryId(int libraryId); 
}
