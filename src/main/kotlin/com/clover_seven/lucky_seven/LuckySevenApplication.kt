package com.clover_seven.lucky_seven

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class LuckySevenApplication

fun main(args: Array<String>) {
    runApplication<LuckySevenApplication>(*args)
}
