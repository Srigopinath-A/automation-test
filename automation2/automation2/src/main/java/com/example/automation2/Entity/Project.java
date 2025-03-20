package com.example.automation2.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Document( collection= "project")
public class Project {
	private String name;
    private String description = "";
    private String localPath = "";
    private String scmType = "";
    private String scmUrl = "";
    private String scmBranch = "";
    private String scmRefspec = "";
    private boolean scmClean = false;
    private boolean scmTrackSubmodules = false;
    private boolean scmDeleteOnUpdate = false;
    private Long credential;
    private int timeout = 0;
    private Long organization;
    private boolean scmUpdateOnLaunch = false;
    private int scmUpdateCacheTimeout = 0;
    private boolean allowOverride = false;
    private Long defaultEnvironment;
    private Long signatureValidationCredential;

}
