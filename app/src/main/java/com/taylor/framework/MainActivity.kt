package com.taylor.framework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.taylor.ad_api.AdFactory
import com.taylor.ad_api.BannerAd
import com.taylor.ad_imp_popad.initAd
import com.taylor.framework.ui.theme.FrameworkTheme
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {
    private val adFactory: AdFactory by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        initAd()
        setContent {
            FrameworkTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }

        val bannerAd = adFactory.get(BannerAd::class.java,"ddd")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FrameworkTheme {
        Greeting("Android")
    }
}