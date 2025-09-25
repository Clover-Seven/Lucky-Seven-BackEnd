package com.clover_seven.lucky_seven.db.tarot.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class TarotTopicDetail(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long, var detail: String, var tarotTopicId: Long
)
