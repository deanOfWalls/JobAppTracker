package com.deanwalls.jobapplicationmanager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class JobApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 45)
    private String companyName;

    @Column(length = 45)
    private String jobTitle;

    @Column(length = 45)
    private String companyUrl;

    @Column(length = 45)
    private String jobPostingUrl;

    @Column(length = 45)
    private String contactName;

    @Column(length = 45)
    private String contactEmail;

    @Column(length = 45)
    private String contactLinkedin;

    @Column
    private int responded;

    @Column
    private Date dateInterview;

    @Column
    private Date dateThanked;

    //Constructors, getters, setters not added yet

}
