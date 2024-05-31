package com.wanted.challenge.domain.transactionhistory.entity;

import com.wanted.challenge.domain.item.entity.Item;
import com.wanted.challenge.domain.member.entity.Member;
import com.wanted.challenge.global.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class TransactionHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean saleStatus;

    @Column(nullable = false)
    private boolean purchaseConfirmStatus;

    @Column(nullable = false)
    private Long purchasePrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

}