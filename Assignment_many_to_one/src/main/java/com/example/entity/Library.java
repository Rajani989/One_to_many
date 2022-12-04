package com.example.entity;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Library {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int LibraryId;
    private String LibraryName;
    @OneToMany(fetch=FetchType.EAGER, mappedBy="library" ,cascade=CascadeType.ALL)
    @JsonIgnoreProperties("library")
    private List<Student> StudentList=new ArrayList<>();
}
