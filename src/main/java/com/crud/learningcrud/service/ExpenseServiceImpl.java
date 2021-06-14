package com.crud.learningcrud.service;

import com.crud.learningcrud.model.Expense;
import com.crud.learningcrud.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService{
    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAll(){
        return expenseRepository.findAll();
    }

    @Override
    public Expense save(Expense expense) {
        Expense expense1= expenseRepository.save(expense);
        return expense1;
    }
}
