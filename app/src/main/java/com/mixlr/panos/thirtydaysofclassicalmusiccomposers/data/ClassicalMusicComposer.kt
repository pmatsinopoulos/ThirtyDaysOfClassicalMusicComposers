package com.mixlr.panos.thirtydaysofclassicalmusiccomposers.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.mixlr.panos.thirtydaysofclassicalmusiccomposers.R

data class ClassicalMusicComposer(
    @DrawableRes val imageResourceId: Int,
    @StringRes val nameResourceId: Int,
    @StringRes val shortBioResourceId: Int
)

val classicalMusicComposers = listOf(
    ClassicalMusicComposer(R.drawable.bach, R.string.bach_name, R.string.bach_short_bio),
    ClassicalMusicComposer(R.drawable.beethoven, R.string.beethoven_name, R.string.beethoven_short_bio),
    ClassicalMusicComposer(R.drawable.brahms, R.string.brahms_name, R.string.brahms_short_bio),
    ClassicalMusicComposer(R.drawable.chopin, R.string.chopin_name, R.string.chopin_short_bio),
    ClassicalMusicComposer(R.drawable.handel, R.string.handel_name, R.string.handel_short_bio),
    ClassicalMusicComposer(R.drawable.haydn, R.string.haydn_name, R.string.haydn_short_bio),
    ClassicalMusicComposer(R.drawable.mozart, R.string.mozart_name, R.string.mozart_short_bio),
    ClassicalMusicComposer(R.drawable.schubert, R.string.schubert_name, R.string.schubert_short_bio),
    ClassicalMusicComposer(R.drawable.tchaikovsky, R.string.tchaikovsky_name, R.string.tchaikovsky_short_bio),
    ClassicalMusicComposer(R.drawable.vivaldi, R.string.vivaldi_name, R.string.vivaldi_short_bio),
)
