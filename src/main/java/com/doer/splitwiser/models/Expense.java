package com.doer.splitwiser.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Entity
public class Expense extends  BaseModel{

    private String description;
    private String name;
    private ExpenseType expenseType;
    @OneToMany
    private List<UserExpense> userExpenseList;


}
