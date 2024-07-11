package com.bootcampspringbatch.batch_processing_demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "CUSTOMERS_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name = "CUSTOMER_ID")
    private int id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "CONTACT")
    private String contactNo;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "DOB")
    private String dob;


        // Constructor, getters, and setters
        public Customer(String country) {
            this.country = country;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }




}