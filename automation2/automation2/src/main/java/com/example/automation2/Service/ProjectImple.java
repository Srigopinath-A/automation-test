package com.example.automation2.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.automation2.Entity.Project;

@Service
public class ProjectImple {
	
	 @Value("${awx.api.url}")
	    private String awxApiUrl;

	    @Value("${awx.api.token}")
	    private String awxApiToken;

	    public String createProject(Project project) {
	        RestTemplate restTemplate = new RestTemplate();

	        HttpHeaders headers = new HttpHeaders();
	        headers.set("Authorization", "Bearer " + awxApiToken);
	        headers.set("Content-Type", "application/json");

	        HttpEntity<Project> request = new HttpEntity<>(project, headers);

	        ResponseEntity<String> response = restTemplate.exchange(
	                awxApiUrl + "/projects/",
	                HttpMethod.POST,
	                request,
	                String.class
	        );

	        return response.getBody();
	    }
}
