package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Slot;
import com.bookStore.repository.SlotRepository;

@Service
public class SlotService {

    @Autowired
    private SlotRepository slotRepository;

    public void save(Slot slot) {
        slotRepository.save(slot);
    }

    public List<Slot> getAllSlots() {
        return slotRepository.findAll();
    }

    public Slot getSlotById(int slotId) {
        return slotRepository.findById(slotId).orElse(null);
    }

    public void deleteById(int slotId) {
        slotRepository.deleteById(slotId);
    }
}
