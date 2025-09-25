package com.clover_seven.lucky_seven.db.user.repository

import com.clover_seven.lucky_seven.db.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {}
