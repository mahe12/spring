package com.karafboot.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by dakshinamoorthyd on 22-11-2016.
 */
@Component
public class CreateLeadRequest implements Serializable{

    private String firstName;
    private String lastName;
    private String company;
    private String email;
    private String phone;
    private String description;
    private String comments;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    @JsonIgnore
    public CreateLeadRequest() {
    }

    public CreateLeadRequest(String firstName, String lastName, String company, String email, String phone, String description, String comments, String street, String city, String state, String postalCode, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.comments = comments;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "CreateLeadRequest{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", company='" + company + '\'' +
            ", email='" + email + '\'' +
            ", phone='" + phone + '\'' +
            ", description='" + description + '\'' +
            ", comments='" + comments + '\'' +
            ", street='" + street + '\'' +
            ", city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", postalCode='" + postalCode + '\'' +
            ", country='" + country + '\'' +
            '}';
    }
}
