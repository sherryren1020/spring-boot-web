package com.rest.webservices.restful_web_services.versioning;

public class Personv2 {
    private Name name;

    public Personv2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
