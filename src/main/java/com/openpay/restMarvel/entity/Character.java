package com.openpay.restMarvel.entity;

import developer.jar.marvel.entity.Url;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author danya
 */
@Getter
@Setter
public class Character {
    
	Integer id;
	String name;
	String description;
	Date modified;
	String resourceURI;
	List<Url> url = new ArrayList<>();
        List<Imagen> image = new ArrayList<>();
        List<ComicList> comics = new ArrayList<>();
        List<StoryList> stories = new ArrayList<>();
        List<EventList> events = new ArrayList<>();
        List<SeriesList> series = new ArrayList<>();
	
	/*urls Array[Url];
	thumbnail Image;
	comics ComicList;
	stories StoryList;
	events EventList;
	series SeriesList;*/
}
