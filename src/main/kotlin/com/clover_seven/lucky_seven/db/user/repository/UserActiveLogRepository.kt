package com.clover_seven.lucky_seven.db.user.repository

import com.clover_seven.lucky_seven.db.user.entity.UserActiveLog
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserActiveLogRepository : JpaRepository<UserActiveLog, Long> {
}
