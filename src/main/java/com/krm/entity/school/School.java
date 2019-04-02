package com.krm.entity.school;

import com.krm.entity.academic.AcademicYear;
import com.krm.entity.address.Address;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "school_id")
    private Long id;

    private String schoolName;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<AcademicYear> academicYears;
}
