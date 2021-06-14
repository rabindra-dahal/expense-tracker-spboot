package com.crud.learningcrud.service;

import com.crud.learningcrud.model.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> findAll();
    Expense save(Expense expense);
}
