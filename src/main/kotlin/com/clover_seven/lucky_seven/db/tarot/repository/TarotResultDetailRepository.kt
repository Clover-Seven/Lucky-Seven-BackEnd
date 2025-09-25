package com.clover_seven.lucky_seven.db.tarot.repository

import com.clover_seven.lucky_seven.db.tarot.entity.TarotResultDetail
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TarotResultDetailRepository : JpaRepository<TarotResultDetail, Long> {
}
