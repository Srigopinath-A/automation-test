package com.example.automation2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.automation2.Entity.Project;
import com.example.automation2.Service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	

	    @Autowired
	    private ProjectService projectService;

	    @PostMapping
	    public ResponseEntity<String> createProject(@RequestBody Project project) {
	        String response = projectService.createProject(project);
	        return ResponseEntity.ok(response);
	    }
}
