package com.doer.splitwiser.services;

import com.doer.splitwiser.models.Expense;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {
    public Expense createExpense(Expense expense) {
        return null;
    }

    public Optional<Expense> findExpense(Integer id) {
        return null;
    }

    public List<Expense> findAllExpenses() {
        return null;
    }

    public Expense updateExpense(Integer id, Expense expense) {
        return expense;
    }

    public void deleteExpense(Integer id) {
    }
}
