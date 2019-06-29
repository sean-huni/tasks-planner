package xyz.tag.tasks.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * PROJECT   : tasks
 * PACKAGE   : xyz.tag.tasks.domain
 * USER      : sean
 * DATE      : 29-Sat-Jun-2019
 * TIME      : 01:48
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
abstract class AuditingAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "created", nullable = false, updatable = false)
    @CreatedDate
    @CreationTimestamp
    private LocalDateTime created;

    @Column(name = "lastModified")
    @UpdateTimestamp
    private LocalDateTime lastModified;
}
