package com.bookStore.entity;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "Slot")
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Slotid")
    private int slotId;

    @Column(name = "Time_Start")
    private LocalTime timeStart;

    @Column(name = "Time_End")
    private LocalTime timeEnd;

    public Slot(int slotId, LocalTime timeStart, LocalTime timeEnd) {
        this.slotId = slotId;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public Slot() {
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public LocalTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalTime timeStart) {
        this.timeStart = timeStart;
    }

    public LocalTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalTime timeEnd) {
        this.timeEnd = timeEnd;
    }
}
