package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TampilLayar()
                }
            }
        }
    }
}
@Composable
fun TampilLayar() {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()) {
        Text(text = "Jogja Panas Banget",
            fontSize = 30.sp,
            color = Color.Red,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(16.dp))

        Spacer(modifier = Modifier.padding(10.dp))

        TampilBox()

        Spacer(modifier = Modifier.padding(10.dp))

        TampilLokasi()

        Spacer(modifier = Modifier.padding(10.dp))

        TampilKeterangan()
    }

    }


@Composable
fun TampilBox() {
    Box(
        Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(color = Color.Blue)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()) {
            val img = painterResource(id = R.drawable.sun)
            Image(painter = img, contentDescription = "Sun",
                modifier = Modifier
                    .size(200.dp)
                    .align(Alignment.CenterHorizontally))
            Text(text = "Cerah Sekali",
                fontSize = 30.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp))

        }

        }
    }

@Composable
fun TampilLokasi() {
    Text(text = "40 C",
        fontSize = 40.sp,
        color = Color.Black,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        )
    Spacer(modifier = Modifier.padding(10.dp))
    Row(verticalAlignment = Alignment.CenterVertically,){
        Image(painter = painterResource(id = R.drawable.jogja1),
            contentDescription = "Jogja",
            modifier = Modifier
                .size(50.dp)
                .align(Alignment.CenterVertically))
        Spacer(modifier = Modifier.padding(10.dp))
        Text(text = "Yogyakarta",
            fontSize = 35.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )

    }
    Spacer(modifier = Modifier.padding(10.dp))
    Text(text = "Brajan, Tamantirto, Kec. Kasihan, Kab. Bantul Daerah Istimewa Yogyakarta ",
        fontSize = 15.sp,
        color = Color.LightGray,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold

    )

    }

@Composable
fun TampilKeterangan() {
    Card (modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp)))
    {
        Row (modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Blue),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically){
            Column (modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Humidity",
                    fontSize = 10.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                    )
                Text(text = "100%",
                    fontSize = 20.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    )
            }
            Column (modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Uv Index",
                    fontSize = 10.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
                Text(text = "10 / 10",
                    fontSize = 20.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Blue),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically){
            Column (modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Subuh",
                    fontSize = 10.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
                Text(text = "04.30 AM",
                    fontSize = 20.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                )
            }
            Column (modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Maghrib",
                    fontSize = 10.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
                Text(text = "17.30 PM",
                    fontSize = 20.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                )
            }
        }

        }
    }




@Preview(showBackground = true)
@Composable
fun WeatherPreview() {
    WeatherAppTheme {
        TampilLayar()

    }
}