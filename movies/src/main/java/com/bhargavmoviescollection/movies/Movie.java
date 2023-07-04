package com.bhargavmoviescollection.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

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
 * 
 * 6) This falls back on the fast manual reference and only stores the 
 * ID of the linked document in MongoDB
 * **/

@Document(collection = "movies") 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	
	@Id
	private ObjectId id;
	
	@JsonProperty
	private String imdbId;
	@JsonProperty
	private String title;
	@JsonProperty
	private String releaseDate;
	@JsonProperty
	private String trailerLink;
	@JsonProperty
	private String poster;
	
	private List<String> genres;
	
	private List<String> backdrops;
	
	
	
	public ObjectId getId() {
		return id;
	}



	public void setId(ObjectId id) {
		this.id = id;
	}



	public String getImdbId() {
		return imdbId;
	}



	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getReleaseDate() {
		return releaseDate;
	}



	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}



	public String getTrailerLink() {
		return trailerLink;
	}



	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}



	public String getPoster() {
		return poster;
	}



	public void setPoster(String poster) {
		this.poster = poster;
	}



	public List<String> getGenres() {
		return genres;
	}



	public void setGenres(List<String> genres) {
		this.genres = genres;
	}



	public List<String> getBackdrops() {
		return backdrops;
	}



	public void setBackdrops(List<String> backdrops) {
		this.backdrops = backdrops;
	}



	public List<Review> getReviewIds() {
		return reviewIds;
	}



	public void setReviewIds(List<Review> reviewIds) {
		this.reviewIds = reviewIds;
	}



	@DocumentReference
	private List<Review> reviewIds;


	

}
