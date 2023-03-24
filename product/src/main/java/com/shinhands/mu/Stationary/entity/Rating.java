package com.shinhands.mu.Stationary.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Table(name="rating")
@SequenceGenerator(name= "RATING_SEQUENCE", sequenceName = "RATING_SEQ", allocationSize = 1)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RATING_SEQUENCE")
    @Column(name="id",nullable=false)
    private Long id;
    @Column(name="comment_product",nullable=false,length=500)
    private String comment;
    @Column(name="rate_score",nullable=false)
    private double rateScore;
    @Column(name="id_user")
    private Long userId;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "deleted")
    private Long deleted = 0L;
//    @Column(name="product_id")
//    private Long productId;
}