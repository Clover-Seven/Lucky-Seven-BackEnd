package com.clover_seven.lucky_seven.db.tarot.entity

import com.clover_seven.lucky_seven.db.BaseTime
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class TarotResult(
    tarotTopicId: Long, userId: Long, situation: String, totalDescription: String
) : BaseTime() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null;

    var tarotTopicId: Long = tarotTopicId
        protected set

    var userId: Long = userId
        protected set

    var situation = situation
        protected set

    var totalDescription = totalDescription
        protected set

}
