package com.clover_seven.lucky_seven.db.user.entity

import com.clover_seven.lucky_seven.db.BaseTime
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class UserHistoryLog(
    userId: Long,
    lastUsedAt: LocalDateTime,
    nextUseAt: LocalDateTime,
) : BaseTime() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var userId: Long? = userId
        protected set

    var lastUsedAt: LocalDateTime? = lastUsedAt
        protected set

    var nextUseAt: LocalDateTime? = nextUseAt
        protected set
}
