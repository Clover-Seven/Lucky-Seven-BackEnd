package com.clover_seven.lucky_seven.db.tarot.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class TarotSpread(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long,
    var sequence: Int,
    var description: String,
    var tarotTopicDetailId: Long
)
