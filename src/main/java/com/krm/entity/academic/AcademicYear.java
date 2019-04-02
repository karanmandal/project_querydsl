package com.krm.entity.academic;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.krm.entity.school.School;
import com.krm.entity.school.SchoolTerm;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class AcademicYear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "academic_year_id")
    private Long id;

    private String description;

    private Boolean isClosed;

    @OneToMany(mappedBy = "academicYear", cascade = CascadeType.ALL)
    private List<SchoolTerm> schoolTerms;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "school_id")
    private School school;
}
