package com.crud.learningcrud.controller;

import com.crud.learningcrud.model.Expense;
import com.crud.learningcrud.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("/expenses")
    public ResponseEntity<List<Expense>> get(){
        List<Expense> expenses = expenseService.findAll();
        return new ResponseEntity<>(expenses, HttpStatus.OK);
    }
    @PostMapping("/expenses")
    public ResponseEntity<Expense> save(@RequestBody Expense expense){
        Expense expenseOne = expenseService.save(expense);
        return new ResponseEntity<>(expenseOne, HttpStatus.OK);
    }
}
