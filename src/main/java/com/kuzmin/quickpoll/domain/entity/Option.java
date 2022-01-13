package com.kuzmin.quickpoll.domain.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Option {
    @Id
    @GeneratedValue
    @Column(name="OPTION_ID")
    private Long id;
    @Column(name="OPTION_VALUE")
    private String value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Option option = (Option) o;
        return id != null && Objects.equals(id, option.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
