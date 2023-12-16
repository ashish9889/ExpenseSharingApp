package com.doer.splitwiser.controller;

import com.doer.splitwiser.models.Expense;
import com.doer.splitwiser.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    // Create (POST) an Expense
    @PostMapping
    public ResponseEntity<Expense> createExpense(@RequestBody Expense expense){
        Expense savedExpense = expenseService.createExpense(expense);
        return new ResponseEntity<>(savedExpense, HttpStatus.CREATED);
    }

    // Read (GET) an Expense by id
    @GetMapping("/{id}")
    public ResponseEntity<Expense> findExpense(@PathVariable Integer id) {
        Optional<Expense> foundExpense = expenseService.findExpense(id);
        return foundExpense.map(expense -> ResponseEntity.ok().body(expense)).orElse(ResponseEntity.notFound().build());

    }

    // Read (GET) all Expenses
    @GetMapping
    public ResponseEntity<List<Expense>> findAllExpenses(){
        List<Expense> expenses = expenseService.findAllExpenses();
        return new ResponseEntity<>(expenses, HttpStatus.OK);
    }

    // Update (PUT) an Expense
    @PutMapping("/{id}")
    public ResponseEntity<Expense> updateExpense(@PathVariable Integer id, @RequestBody Expense expense) {
        Expense updatedExpense = expenseService.updateExpense(id, expense);
        return ResponseEntity.ok(updatedExpense);
    }

    // Delete (DELETE) an Expense
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExpense(@PathVariable Integer id){
        expenseService.deleteExpense(id);
        return ResponseEntity.noContent().build();
    }
}
