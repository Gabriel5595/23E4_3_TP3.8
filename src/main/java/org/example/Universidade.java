package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.json.JSONArray;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Universidade {
    @JsonProperty("name")
    private String name;
    @JsonProperty("web_pages")
    private JSONArray url;

    public Universidade(String name, JSONArray url){
        this.name = name;
        this.url = url;
    }
    @Override
    public String toString(){
        return "Universidade{" +
                "Name = " + getName() + " / " +
                "URLs = " + getUrl() + "}";
    }
}
