package com.clover_seven.lucky_seven.db.user.entity

import com.clover_seven.lucky_seven.db.BaseTime
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class User(
    sub: String, platform: String, nickname: String
) : BaseTime() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var sub: String = sub
        protected set

    var platform: String = platform
        protected set

    var nickname: String = nickname
        protected set
}
