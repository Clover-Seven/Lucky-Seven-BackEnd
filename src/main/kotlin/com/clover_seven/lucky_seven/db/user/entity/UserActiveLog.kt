package com.clover_seven.lucky_seven.db.user.entity

import com.clover_seven.lucky_seven.db.BaseTime
import com.clover_seven.lucky_seven.enums.ServiceType
import jakarta.persistence.*

@Entity
class UserActiveLog(
    userId: Long,
    serviceType: ServiceType,
) : BaseTime() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var userId: Long = userId
        protected set

    @Enumerated(EnumType.STRING)
    var serviceType: ServiceType = serviceType
        protected set

    var serviceCount: Int = 0
        protected set
}
