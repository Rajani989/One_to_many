package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Library;
import com.example.service.LibrariayService;

@RestController
@RequestMapping("/Library")
public class LibraryController {

	 @Autowired
     private LibrariayService libraryservice;
   
   @RequestMapping(value="/savelibrary", method=RequestMethod.POST)
   @ResponseBody
   public Library saveLibrary(@RequestBody Library l) {
  	 Library libraryResponse=libraryservice.saveLibrary(l);
  	 return libraryResponse;
  	
   }
   @RequestMapping(value="/{id}", method=RequestMethod.GET)
   @ResponseBody
   public Library findByLibraryId(@PathVariable int id) {
  	 Library libraryResponse=libraryservice.findByLibraryId(id);
  	 return libraryResponse;
}
  
}
