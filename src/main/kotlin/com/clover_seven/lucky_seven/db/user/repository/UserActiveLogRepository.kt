package com.clover_seven.lucky_seven.db.user.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserActiveLogRepository : JpaRepository<UserActiveLogRepository, Long> {
}
