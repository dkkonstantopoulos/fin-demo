package com.dkonstan.fin.demo.common.repository;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Objects;

@MappedSuperclass
public abstract class CommonEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    private String id;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private ZonedDateTime createdDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private ZonedDateTime lastUpdatedAt;

    @LastModifiedBy
    private String lastModifiedBy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonEntity that = (CommonEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
