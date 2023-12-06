package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Entrada {
    @JsonProperty("name")
    private String name;
    @JsonProperty("web_pages")
    private List<String> url;

    @Override
    public String toString(){
        return "Entrada{" +
                "Name = " + getName() + " / " +
                "URLs = " + getUrl() + "}";
    }
}
