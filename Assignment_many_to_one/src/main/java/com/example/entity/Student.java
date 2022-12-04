package com.example.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Student {
         @Id@GeneratedValue(strategy=GenerationType.AUTO)
         private int StudentId;
         private String StudentName;
         @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
         @JoinColumn(name="libray_id", referencedColumnName="LibraryId")
         @JsonIgnoreProperties("Library")
         private Library library;
         
}
