package com.doer.splitwiser.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Group extends BaseModel{
    private String name;
    private String description;
    @ManyToMany
    private List<User> users;
    @OneToMany
    private List<Expense> expenses;

}
