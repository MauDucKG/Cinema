package cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import cinema.model.Transaction;
import cinema.service.TransactionService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transaction_register")
    public String transactionRegister() {
        return "transactionRegister";
    }

    @GetMapping("/available_transactions")
    public ModelAndView getAllTransactions() {
        List<Transaction> transactionList = transactionService.getAllTransactions();
        return new ModelAndView("transactionList", "transaction", transactionList);
    }

    @PostMapping("/saveTransaction")
    public String addTransaction(@ModelAttribute Transaction transaction) {
        transactionService.save(transaction);
        return "redirect:/available_transactions";
    }

//    @RequestMapping("/editTransaction/{id}")
//    public String editTransaction(@PathVariable("id") int id, Model model) {
//        Transaction transaction = transactionService.getTransactionById(id);
//        model.addAttribute("transaction", transaction);
//        return "transactionEdit";
//    }

    @RequestMapping("/deleteTransaction/{id}")
    public String deleteTransaction(@PathVariable("id") int id) {
        transactionService.deleteById(id);
        return "redirect:/available_transactions";
    }
}
