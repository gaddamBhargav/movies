package com.bhargavmoviescollection.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**1)The annotations @Document applied to a class marks this class 
 * as a candidate for mapping to the database
 * 
 * 2) @Data is a convenient shortcut annotation that bundles the features 
 * of @ToString , @EqualsAndHashCode , @Getter / @Setter and @RequiredArgsConstructor together
 * 
 * 3) The @AllArgsConstructor annotation generates a constructor with 
 * one parameter for every field in the class
 * 
 * 4) The @NoArgsConstructor annotation is used to generate the 
 * no-argument constructor for a class
 * 
 * 5) The @Id annotation offer the simplest mechanism to 
 * define the mapping to the primary key
 * **/

@Document(collection = "movies") 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
	
	@Id
	private ObjectId id;
	@Field
	private String body;

	
	
	public ObjectId getId() {
		return id;
	}



	public void setId(ObjectId id) {
		this.id = id;
	}



	public String getBody() {
		return body;
	}



	public void setBody(String body) {
		this.body = body;
	}



	public Review(String body) {
		super();
		this.body = body;
	}
	

}
