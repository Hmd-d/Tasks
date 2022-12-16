package com.example.tasks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tasks.ui.theme.TasksTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TasksTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    TasksImage(text1 = stringResource(id = R.string.first_string),
                        text2 = stringResource(id = R.string.second_string))
                }
            }
        }
    }
}

@Composable
fun TasksTexts(text1: String, text2: String) {


    Text(

        text= text1,
        fontSize = 24.sp,
        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
        //fontWeight = FontWeight.Bold

        /*modifier = Modifier.padding(top = 24.dp, bottom = 18.dp)
            .fillMaxWidth()
            .wrapContentWidth(CenterHorizontally)
            /*.wrapContentHeight(CenterVertically)*/,*/
    )

    Text(
        text= text2,
        fontSize = 16.sp
        /*modifier = Modifier.fillMaxWidth()
            .wrapContentWidth(CenterHorizontally)
            /*.wrapContentHeight(CenterVertically)*/,*/


    )


}

@Composable
fun TasksImage(text1: String, text2: String) {

    val image = painterResource(R.drawable.tasks_image)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Image(

            painter = image,
            contentDescription = null,
            /*modifier = Modifier.fillMaxWidth()
                .wrapContentWidth(CenterHorizontally)
                /*.wrapContentHeight(CenterVertically)*/,
            contentScale = ContentScale.Crop*/

        )

        TasksTexts(text1 = text1, text2 = text2)


    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TasksTheme {
        Surface {
            TasksImage(
                text1 = stringResource(id = R.string.first_string),
                text2 = stringResource(id = R.string.second_string)
            )
        }

    }
}