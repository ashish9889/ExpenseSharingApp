package com.doer.splitwiser.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserExpense extends BaseModel{
    private User user;
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private UserExpenseType userExpenseType;
    private Expense expense;
}
