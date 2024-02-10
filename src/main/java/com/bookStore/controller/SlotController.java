package com.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.entity.Slot;
import com.bookStore.service.SlotService;

import java.util.List;

@Controller
public class SlotController {

    @Autowired
    private SlotService slotService;

    @GetMapping("/slot_register")
    public String slotRegister() {
        return "slotRegister";
    }

    @GetMapping("/available_slots")
    public ModelAndView getAllSlots() {
        List<Slot> slotList = slotService.getAllSlots();
        return new ModelAndView("slotList", "slot", slotList);
    }

    @PostMapping("/saveSlot")
    public String addSlot(@ModelAttribute Slot slot) {
        slotService.save(slot);
        return "redirect:/available_slots";
    }

    @RequestMapping("/editSlot/{id}")
    public String editSlot(@PathVariable("id") int id, Model model) {
        Slot slot = slotService.getSlotById(id);
        model.addAttribute("slot", slot);
        return "slotEdit";
    }

    @RequestMapping("/deleteSlot/{id}")
    public String deleteSlot(@PathVariable("id") int id) {
        slotService.deleteById(id);
        return "redirect:/available_slots";
    }
}
