package com.mixlr.panos.thirtydaysofclassicalmusiccomposers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mixlr.panos.thirtydaysofclassicalmusiccomposers.data.classicalMusicComposers
import com.mixlr.panos.thirtydaysofclassicalmusiccomposers.ui.theme.ThirtyDaysOfClassicalMusicComposersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtyDaysOfClassicalMusicComposersTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    ClassicalMusicComposersList()
                }
            }
        }
    }
}

@Composable
fun ClassicalMusicComposersList(
    modifier: Modifier = Modifier
) {
    LazyColumn(
    ) {
        itemsIndexed(classicalMusicComposers) { index, musicComposer ->
            Card(
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentHeight(align = Alignment.Top)
                    .padding(20.dp)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp)
                ) {
                    DayNumber(number = index + 1)
                    ComposerName(name = musicComposer.nameResourceId)
                    ComposerImage(image = musicComposer.imageResourceId)
                    ComposerShortBio(shortBio = musicComposer.shortBioResourceId)
                }
            }
        }
    }

}

@Composable
fun DayNumber(
    number: Int, modifier: Modifier = Modifier
) {
    Text(
        text = "Day $number", modifier = modifier, style = MaterialTheme.typography.labelSmall
    )
}

@Composable
fun ComposerName(
    @StringRes name: Int, modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(id = name),
        modifier = modifier
            .padding(top = 8.dp, bottom = 8.dp),
        style = MaterialTheme.typography.labelLarge
    )
}

@Composable
fun ComposerImage(
    @DrawableRes image: Int, modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = image),
        contentDescription = null,
        modifier = modifier
            .fillMaxWidth(),
        contentScale = ContentScale.FillWidth
    )
}

@Composable
fun ComposerShortBio(
    @StringRes shortBio: Int, modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(id = shortBio),
        modifier = modifier
            .padding(top = 10.dp),
        style = MaterialTheme.typography.bodyLarge
    )
}

@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
fun GreetingPreview() {
    ThirtyDaysOfClassicalMusicComposersTheme {
        ClassicalMusicComposersList()
    }
}
