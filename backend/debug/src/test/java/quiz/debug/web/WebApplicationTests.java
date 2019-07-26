package quiz.debug.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import quiz.debug.web.entity.Book;
import quiz.debug.web.entity.User;

import java.io.IOException;

public class WebApplicationTests {

    @Test
    public void addBook() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/book/add/";
        String id = "EF7FDB919CED44C2AF8A1EED25683119";
        Book book = new Book().setId(id).setName("foo");
        UriComponents builder = UriComponentsBuilder.fromHttpUrl(url).build();
        ResponseEntity<String> response = restTemplate.postForEntity(builder.toUri(), book, String.class);
        Assert.assertEquals(id, response.getBody());
    }

    @Test
    public void getUser() throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/user/get/";
        String id = "3CDD0D9D92F5400C8EB4C7A7CDA07504";
        UriComponents builder = UriComponentsBuilder.fromHttpUrl(url).queryParam("id",id).build();
        ResponseEntity<String> response = restTemplate.getForEntity(builder.toUriString(), String.class);
        String name = new ObjectMapper().readValue(response.getBody(), User.class).getName();
        Assert.assertEquals("mike", name);
    }

}
