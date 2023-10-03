package com.example.demo.entities.audit;

import jakarta.persistence.*;
import org.hibernate.envers.RevisionTimestamp;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "REVISION_INFO")
public class Revision implements Serializable {
    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_seq")
    @SequenceGenerator(
            name = "revision_seq",
            sequenceName = "rbac.seq_revusuib_id"
    )
    private int id;

    @Column(name = "REVISION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;
}
