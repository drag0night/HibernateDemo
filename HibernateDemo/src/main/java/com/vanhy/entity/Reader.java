package com.vanhy.entity;
// Generated May 25, 2018 8:48:05 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Reader generated by hbm2java
 */
public class Reader  implements java.io.Serializable {


     private int personId;
     private Person person;
     private String codeReader;
     private Set borrowlists = new HashSet(0);

    public Reader() {
    }

	
    public Reader(Person person) {
        this.person = person;
    }
    public Reader(Person person, String codeReader, Set borrowlists) {
       this.person = person;
       this.codeReader = codeReader;
       this.borrowlists = borrowlists;
    }
   
    public int getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    public String getCodeReader() {
        return this.codeReader;
    }
    
    public void setCodeReader(String codeReader) {
        this.codeReader = codeReader;
    }
    public Set getBorrowlists() {
        return this.borrowlists;
    }
    
    public void setBorrowlists(Set borrowlists) {
        this.borrowlists = borrowlists;
    }




}

