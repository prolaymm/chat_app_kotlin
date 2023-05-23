package com.norgianking.chatapp.data.vos




data class MessageVo (
    val date: String? = null,
    val allMessage: List<AllMessage>? = null
)

data class AllMessage (
    val text: String? = null,
    val sender: Int? = null
)
