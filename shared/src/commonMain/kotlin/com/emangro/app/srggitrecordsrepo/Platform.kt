package com.emangro.app.srggitrecordsrepo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform