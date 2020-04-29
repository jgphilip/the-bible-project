package com.boomzoned.thebibleproject.models

data class Verse(val verseNumber: Int, val verseText: String)
data class Chapter(val chapterNumber: Int, val versesCount: Int, val verses: List<Verse>)
data class Book(
    val bookName: String,
    val bookNumber: Int,
    val isOldTestament: Boolean,
    val chapters: List<Chapter>
)