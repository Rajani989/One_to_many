package com.example.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Library;

import com.example.entity.Student;
import com.example.repository.LibrariayRepository;
import com.example.service.LibrariayService;

@Service
public class LibrariayServiceImpl implements LibrariayService {
 
	 @Autowired
	    private LibrariayRepository libraryRepository;
		@Override
		public Library saveLibrary(Library l) {
			// TODO Auto-generated method stub
			List<Student> storyList=new ArrayList<>();
			Student s1=new Student();
			s1.setStudentName("Ram");
			
			Student s2=new Student();
			s2.setStudentName("shyam");
			
			Student s3=new Student();
			s3.setStudentName("mohan");
			
			storyList.add(s1);
			storyList.add(s2);
			storyList.add(s3);
			
			s1.setLibrary(l);
			s2.setLibrary(l);
			s3.setLibrary(l);
			
			l.setStudentList(storyList);
		    l=libraryRepository.save(l);
			return l;
		}

		@Override
		public Library findByLibraryId(int libraryId) {
			// TODO Auto-generated method stub
			Optional<Library> l=libraryRepository.findById(libraryId); 
			return l.get();
		}
}
