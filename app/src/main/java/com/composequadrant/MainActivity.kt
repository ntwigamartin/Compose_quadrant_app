package com.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(

) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .height(425.dp)
                .fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(200.dp)
                    .height(425.dp)
                    .background(color = Color(0xFFEADDFF))
                    .padding(16.dp)
            ) {
                Quadrant(
                    heading = stringResource(id = R.string.text_composable_heading),
                    body = stringResource(id =R.string.text_composable_body)
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(200.dp)
                    .height(425.dp)
                    .background(color = Color(0xFFD0BCFF))
                    .padding(16.dp)
            ) {
                Quadrant(
                    heading = stringResource(id = R.string.image_composable_heading),
                    body = stringResource(id =R.string.image_composable_body)
                )
            }
        }
        Row(
            modifier = Modifier
                .height(425.dp)
                .fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(200.dp)
                    .height(425.dp)
                    .background(color = Color(0xFFB69DF8))
                    .padding(16.dp)
            ) {
                Quadrant(
                    heading = stringResource(id = R.string.row_composable_heading),
                    body = stringResource(id =R.string.row_composable_body)
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(200.dp)
                    .height(425.dp)
                    .background(color = Color(0xFFF6EDFF))
                    .padding(16.dp)
            ) {
                Quadrant(
                    heading = stringResource(id = R.string.column_composable_heading),
                    body = stringResource(id =R.string.column_composable_body)
                )
            }
        }
    }
}

@Composable
fun Quadrant(heading: String, body: String) {
    val defaultTextStyle = TextStyle(fontSize = 16.sp)

    Text(
        text = heading,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(bottom = 16.dp)
    )
    Text(
        text = body,
        textAlign = TextAlign.Justify,
        style = defaultTextStyle
    )
}



@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()
    }
}