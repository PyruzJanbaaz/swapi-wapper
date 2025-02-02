package com.pyruz.dzm.swapi.model.dto.people;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PeopleDto implements Serializable {
   private String name;
   private String height;
   private String mass;
   private String hair_color;
   private String skin_color;
   private String eye_color;
   private String birth_year;
   private String gender;
   private String homeworld;
   private String created;
   private String edited;
   private String url;
   private List<String> films;
   private List<String> species;
   private List<String> vehicles;
   private List<String> starships;
}
