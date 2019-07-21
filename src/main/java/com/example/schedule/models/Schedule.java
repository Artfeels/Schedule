package com.example.schedule.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String taskname;
    @Column(length = 1024, nullable = false)
    private String description;
    private String creator;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    private Date creationDate;
    private Date dueDate;

}
