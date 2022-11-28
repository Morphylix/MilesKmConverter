package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

val MILES = "miles"
val KM = "km"

fun Application.configureRouting() {

    routing {
        get("/mtok") {
            call.parameters[MILES]
            call.respondText("Hello World!")
        }

        get("/ktom") {
            val km = call.parameters[KM]?.toInt()
            val res = (km ?: 0) / 1.6
            call.respondText("$km km = $res miles")
        }
    }
}



